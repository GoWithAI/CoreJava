package corejava.streams.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Runnable demo for COMPARATOR_MULTI_FIELD_SORTING.md.
 *
 * Sorts employees by firstName, then username, then age — the same ordering
 * produced eight different ways, so the output of every approach can be compared
 * side by side. Run it with:  java EmployeeSortingDemo
 */
public class EmployeeSortingDemo {

    record Employee(String firstName, String username, int age) {
        @Override
        public String toString() {
            return String.format("%-6s %-10s %3d", firstName, username, age);
        }
    }

    static final Comparator<Employee> BY_NAME_USERNAME_AGE =
            Comparator.comparing(Employee::firstName)
                      .thenComparing(Employee::username)
                      .thenComparingInt(Employee::age);

    static List<Employee> data() {
        return new ArrayList<>(List.of(
                new Employee("Ravi", "ravi.s", 41),
                new Employee("Anita", "anita.p", 29),
                new Employee("Ravi", "ravi.k", 30),
                new Employee("Ravi", "ravi.k", 24),
                new Employee("anita", "anita.b", 35),
                new Employee("Bhavesh", "bhavesh.j", 52),
                new Employee("Anita", "anita.p", 22)));
    }

    public static void main(String[] args) {
        print("0. UNSORTED INPUT", data());

        // ── 1. Comparator chain, sorted in place ────────────────────────────
        List<Employee> a = data();
        a.sort(Comparator.comparing(Employee::firstName)
                         .thenComparing(Employee::username)
                         .thenComparingInt(Employee::age));
        print("1. list.sort(...) - comparator chain, in place", a);

        // ── 2. Same chain via a Stream — source list untouched ──────────────
        List<Employee> source = data();
        List<Employee> b = source.stream().sorted(BY_NAME_USERNAME_AGE).toList();
        print("2. stream().sorted(...) - new list, source unchanged", b);
        print("   source list after the stream (proof it did not mutate)", source);

        // ── 3. Hand-rolled lambda — what the chain replaces ─────────────────
        List<Employee> c = data();
        c.sort((x, y) -> {
            int r = x.firstName().compareTo(y.firstName());
            if (r != 0) return r;
            r = x.username().compareTo(y.username());
            if (r != 0) return r;
            return Integer.compare(x.age(), y.age());
        });
        print("3. hand-rolled lambda - same result, more surface for bugs", c);

        // ── 4. Anonymous inner class — the pre-Java-8 way ───────────────────
        List<Employee> d = data();
        d.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee x, Employee y) {
                return BY_NAME_USERNAME_AGE.compare(x, y);
            }
        });
        print("4. anonymous Comparator - pre-Java-8 style", d);

        // ── 5. Case-insensitive first name ──────────────────────────────────
        List<Employee> e = data();
        e.sort(Comparator.comparing(Employee::firstName, String.CASE_INSENSITIVE_ORDER)
                         .thenComparing(Employee::username)
                         .thenComparingInt(Employee::age));
        print("5. case-insensitive first name - note 'anita' now sits with 'Anita'", e);

        // ── 6. Age descending, the other two ascending ──────────────────────
        List<Employee> f = data();
        f.sort(Comparator.comparing(Employee::firstName)
                         .thenComparing(Employee::username)
                         .thenComparing(Comparator.comparingInt(Employee::age).reversed()));
        print("6. age DESCENDING only - reverse the age comparator, not the chain", f);

        // ── 7. The .reversed() trap — reverses everything before it ─────────
        List<Employee> g = data();
        g.sort(BY_NAME_USERNAME_AGE.reversed());
        print("7. chain.reversed() - WRONG for 'only age desc': ALL fields flipped", g);

        // ── 8. Null-safe first name ─────────────────────────────────────────
        List<Employee> h = data();
        h.add(new Employee(null, "ghost.user", 33));
        h.sort(Comparator.comparing(Employee::firstName,
                                    Comparator.nullsLast(Comparator.naturalOrder()))
                         .thenComparing(Employee::username)
                         .thenComparingInt(Employee::age));
        print("8. null firstName pushed to the end with nullsLast", h);

        // ── 9. TreeSet — uniqueness is compare()==0, NOT equals() ───────────
        Set<Employee> partial = new TreeSet<>(Comparator.comparing(Employee::firstName));
        partial.addAll(data());
        print("9a. TreeSet on firstName ONLY - duplicates silently dropped ("
                + partial.size() + " of " + data().size() + ")", List.copyOf(partial));

        Set<Employee> full = new TreeSet<>(BY_NAME_USERNAME_AGE);
        full.addAll(data());
        print("9b. TreeSet on the FULL chain - every employee survives ("
                + full.size() + " of " + data().size() + ")", List.copyOf(full));

        // ── 10. Group first, sort inside each group ─────────────────────────
        Map<String, List<Employee>> byName = data().stream()
                .sorted(BY_NAME_USERNAME_AGE)
                .collect(Collectors.groupingBy(Employee::firstName,
                         java.util.LinkedHashMap::new, Collectors.toList()));
        System.out.println("== 10. grouped by firstName, sorted inside each group ==");
        byName.forEach((name, list) -> {
            System.out.println("   " + name);
            list.forEach(emp -> System.out.println("      " + emp));
        });
        System.out.println();

        // ── 11. Stability — no tie-breaker keeps ORIGINAL relative order ────
        List<Employee> i = data();
        i.sort(Comparator.comparing(Employee::firstName));
        print("11. firstName only - TimSort is stable, so ties keep input order", i);
    }

    static void print(String title, List<Employee> employees) {
        System.out.println("== " + title + " ==");
        employees.forEach(e -> System.out.println("   " + e));
        System.out.println();
    }
}

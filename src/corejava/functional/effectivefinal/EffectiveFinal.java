package corejava.functional.effectivefinal;

import java.util.List;

public class EffectiveFinal {

    record Employee(String name, int salary) {
        int getSalary() {
            return salary;
        }
    }

    static void main() {


        // why it should be final
        final String name = "Deepak";

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(name);
            }
        }).start();

        String name2 = "Deepak"; // effectively final

        new Thread(() -> {
            System.out.println(name2);
        }).start();

        //Works because prefix is effectively final.
        String prefix = "Hello";
        List<String> names = List.of("A", "B", "C");
        names.forEach(n -> System.out.println(prefix + " " + n));

        // works because effective final
        int count = 10;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(count);
            }
        };
        r.run();

        List<Employee> employees = List.of(new Employee("Deepak", 50000), new Employee("Akash", 60000));

        int bonus = 1000;
        employees.stream()
                .map(emp -> emp.getSalary() + bonus)
                .forEach(System.out::println);


        // does NOT compile: modifying it means it is no longer effectively final
        // int modified = 10;
        // modified++;
        // Runnable r2 = () -> System.out.println(modified);
    }
}

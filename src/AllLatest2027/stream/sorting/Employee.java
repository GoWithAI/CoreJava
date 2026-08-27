package AllLatest2027.stream.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {

    public static final Comparator<Employee> BY_NAME_USERNAME_AGE =
            Comparator.comparing(Employee::getFirstName)
                      .thenComparing(Employee::getUsername)
                      .thenComparingInt(Employee::getAge);

    private final String firstName;
    private final String username;
    private final int age;

    public Employee(String firstName, String username, int age) {
        this.firstName = firstName;
        this.username = username;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee other) {
        return BY_NAME_USERNAME_AGE.compare(this, other);
    }

    @Override
    public String toString() {
        return String.format("%-8s %-10s %3d", firstName, username, age);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Ravi", "ravi.s", 41),
                new Employee("Anita", "anita.p", 29),
                new Employee("Ravi", "ravi.k", 30),
                new Employee("Ravi", "ravi.k", 24),
                new Employee("Bhavesh", "bhavesh.j", 52),
                new Employee("Anita", "anita.p", 22)));

        employees.sort(BY_NAME_USERNAME_AGE);
        employees.forEach(System.out::println);
    }
}

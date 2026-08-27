package corejava.functional.effectivefinal;

import java.util.List;

public class EffectiveFinal {

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

        int bonus = 1000;
        employees.stream()
                .map(emp -> emp.getSalary() + bonus)
                .forEach(System.out::println);


        int count = 10;
        count++; // modified
        Runnable r = () -> {
            System.out.println(count);
        };
    }
}

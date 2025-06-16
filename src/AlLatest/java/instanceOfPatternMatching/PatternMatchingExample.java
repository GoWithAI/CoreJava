package AlLatest.java.instanceOfPatternMatching;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        instanceOf(obj);
        instanceOfPatternMatching(obj);
    }

    private static void instanceOf(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj; // explicit casting is required
            System.out.println(s);
        }
    }

    private static void instanceOfPatternMatching(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s);
        }
    }
}

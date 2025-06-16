package AlLatest.java.instanceOfPatternMatching;

public class PatternMatchingExample2 {

    public static void main(String[] args) {

        double perimeter = getPerimeter(new Rectangle(10, 5));
        System.out.println("Perimeter of Rectangle: " + perimeter);

        double perimeterOfCircle = getPerimeter(new Circle(10));
        System.out.println("Perimeter of Circle: " + perimeterOfCircle);
    }

    private static double getPerimeter(Shape shape) {
        if (shape instanceof Rectangle r) {
            return 2 * (r.length() + r.width());
        } else if (shape instanceof Circle c) {
            return 2 * Math.PI * c.radius();
        }
        throw new IllegalArgumentException("Unknown shape: " + shape);
    }
}

package AlLatest.java.instanceOfPatternMatching;

public class PatternMatchingScopeExample3 {
    public static void main(String[] args) {
        getPerimeter(new Rectangle(1,1));
        getPerimeter(new NoShape());
    }

    // if True then validate scope of r and c
    public static double getPerimeter(Shape shape) {
        if (shape instanceof Rectangle r) {
            // r is in scope here
            System.out.println(r);
        } else if (shape instanceof Circle c) {
            // c is in scope here
            System.out.println(c);
            // System.out.println(r); // r is not in scope here
        } else {
             //System.out.println(r); // r is not in scope here
             //System.out.println(s); // s is not in scope here
        }
        //System.out.println(r); // r is not in scope here
        //System.out.println(s); // s is not in scope here
        throw new IllegalArgumentException("Unknown shape: " + shape);
    }

    public static boolean getPerimeter2(Shape shape) {
        if (!(shape instanceof Rectangle r)){
            // r is not in scope here
            return true;
        }
        // r is in scope here - because of above if-condition expression shape is not an instance of Rectangle
        return r.length() > 0; // scope of a pattern variable can extend beyond the statement
    }

}

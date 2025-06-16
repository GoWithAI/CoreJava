package AlLatest.java.instanceOfPatternMatching;

public class PatternMatchingIFStatementEx4 {
    public static void main(String[] args) {

        ifAndExample();
        ifOrExample();
    }

    private static void ifOrExample(Shape shape) {

        // circuit breaker &&
        if(shape instanceof Rectangle r && r.length() > 0){
            System.out.println(r);
        }
    }

    private static void ifAndExample(Shape shape) {

         // will not compile - first one true/false both case wont make sense to use r After ||
        /*if(shape instanceof Rectangle r || r.length() > 0){
            System.out.println(r);
        }*/
    }
}

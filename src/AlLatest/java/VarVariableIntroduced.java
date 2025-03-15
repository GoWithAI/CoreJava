package AlLatest.java;

public class VarVariableIntroduced {
    static Integer count;

    public static void main(String[] args) {
        String name;
        var b = count; //1
        System.out.println(b.getClass().getName());
        //var s = name; //2
        var k = 1;
        //k = "2"; // 3


    }

    private static void test() {
        String name;
        //name = "";
        //name = 1;

       // var str;// null - type inference
      //  str = ""; //reinitalize



    }

    private static int getString(String s) {
        return s.length();
    }
}

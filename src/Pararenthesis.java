import java.util.Stack;

public class Pararenthesis {
    static void main() {
        String par = "{{{(())}}}";

        Stack stack = new Stack();


        // val - total size % 2 => if 0 then valid
        char[] charArray = par.toCharArray();

        if((par.toCharArray() % 2) != 0)
            System.out.println("Not matching String");


        int start = 0;
        int end = charArray.length - 1;

        while(true){
            if(charArray[start] != charArray[end]){
                System.out.println("Not matching String");
                break;
            }
        }
    }
}

package AllLatest2026;

public class SampleTest {
    static void main() {
        String s = "ASFFHGHHSSS";

        int start = 0 , end = 0;
        String temp = "";

        while(start < s.length()){

            char currChar = s.charAt(end);
            char nextChar = s.charAt(end++);
            if(currChar == nextChar){
                temp = temp + currChar;
                generalLogic(temp, currChar, start, end);
                break;
            }
            char[] charArray = temp.toCharArray();
            for(char ch : charArray){
                if(ch == nextChar ){
                    temp = temp + currChar;
                    generalLogic(temp, currChar, start, end);
                    break;
                }
            }
            temp = temp + currChar;
            System.out.println(temp + " " + start + " " + end );

        }
    }

    private static void generalLogic(String temp, char currChar, int start, int end) {
        temp = temp + currChar;
        System.out.println(temp + " " + start + " " + end);
        start = end;
        end++;
    }
}

// 2 pointers start, end, temp
// longest character, non repeating char
// cond - end -> next should same char
// temp -> has next char skip
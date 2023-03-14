package interviewQuestions.exception;

// java -ea AssertEx  ::-> Here needs assertion enabled - if enabled then compile time error
//java –enableassertions AssertEx
// java.lang.AssertionError
public class AssertEx {
	public static void main(String[] args) {
		assert args == null : "Null";
		System.out.println("OK");

		int x = -1;
		assert x >= 0;
	}
}

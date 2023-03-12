package interviewQuestions.exception;

public class CatchBlockExceptionSequenceEx {

	static Integer i;

	public static void main(String[] args) {
		try {
			System.out.println(i.doubleValue());
		} catch (NullPointerException e) {
			System.out.println();
		} catch (Exception e) {
		}

	}

}

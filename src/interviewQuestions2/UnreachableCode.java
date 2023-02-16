package interviewQuestions2;

public class UnreachableCode {
	public static void main(String[] args) {
		try {
			int i = 9 / 0;
			System.out.println(i);
			return;
		} catch (Exception e) {
			System.out.println("exception caught" + e.getMessage());
			return;
		} finally {
			System.out.println("Execution completed");
		}
		//System.out.println("task completed"); // Compile time error
	}
}

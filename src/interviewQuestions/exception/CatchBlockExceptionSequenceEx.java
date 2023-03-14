package interviewQuestions.exception;

public class CatchBlockExceptionSequenceEx {

	static Integer i;

	static Integer j = 0;
	
	public static void main(String[] args) {
		catchTest();
		catchTest2();
	}

	private static void catchTest2() {
		try {
				int x = 10;
				System.out.println(x % j.intValue()); // ArithmeticException
		}catch (NullPointerException e) {
			System.out.println("catchTest2 : catch" );
		}finally {
			System.out.println("catchTest2 : Finally");
		}
	}

	private static void catchTest() {
		try {
			System.out.println(i.doubleValue());
		} catch (NullPointerException e) {
			System.out.println();
		} catch (Exception e) {
		}
	}

}

package whatIsOutPutExamples;

public class TryCatchFinallyReturnExaple {

	public static void main(String[] args) {
		
		System.out.println("return call() :"+call());
	}

	private static String call() {
		
		try {
			System.out.println("try-sysout");
			int a = 5;
			int c = 5 / 0;
			return "try";
		} catch (Exception e) {
			System.out.println("catch");
			try {
				System.out.println("Inner-try-sysout");
				return "catch>try";
			}finally {
				System.out.println("Inner-finally-sysout");
				return "catch>finally";
			}
		} finally {
			System.out.println("finally-sysout");
			return "finally";
		}
		
	}

}

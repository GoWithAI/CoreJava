package whatIsOutPutExamples;

import java.util.concurrent.Callable;

public class TryCatchFinallyReturnExaple {

	public static void main(String[] args) {
		
		System.out.println(call());
	}

	private static String call() {
		
		try {
			//System.out.println("try");
			int a = 5;
			int c = 5 / 0;
			return "try";
		} catch (Exception e) {
			//System.out.println("catch");
			try {
				return "catch>try";
			}finally {
				return "catch>finally";
			}
		} finally {
			//System.out.println("finally");
			return "finally";
		}
		
	}

}

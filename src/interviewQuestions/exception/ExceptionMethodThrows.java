package interviewQuestions.exception;

import java.io.IOException;

public class ExceptionMethodThrows {
	public static void main(String[] args) {
		// need to handle exception
		//new ExceptionMethodThrows().test();
		new ExceptionMethodThrows().test2();
		//new ExceptionMethodThrows().test3();
		new ExceptionMethodThrows().test4();
		new ExceptionMethodThrows().test5();
		//new ExceptionMethodThrows().test6();
	}

	public void test() throws Exception {}

	public void test2() throws RuntimeException  {}

	public void test3() throws Throwable  {}

	public void test4() throws Error {}
	
	public void test5() throws ArithmeticException {}
	
	public void test6() throws IOException {}
}

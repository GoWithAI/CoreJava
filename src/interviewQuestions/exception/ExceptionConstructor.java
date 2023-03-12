package interviewQuestions.exception;

import java.io.IOException;

public class ExceptionConstructor {

	public ExceptionConstructor() throws ArithmeticException { // Unchecked
		throw new ArithmeticException("Contructor");
	}

	public ExceptionConstructor(int i) throws IOException {// Checked
		throw new IOException("Contructor");
	}

	public ExceptionConstructor(String s) throws InterruptedException { // Checked
		Thread.sleep(1000);
	}

	public static void main(String[] args) {
		new ExceptionConstructor();

		try {
			new ExceptionConstructor(10);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			new ExceptionConstructor("Deepak");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

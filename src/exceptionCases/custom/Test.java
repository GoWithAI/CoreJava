package exceptionCases.custom;

public class Test {

	public static void main(String[] args) {
		ExceptionRaisingClass e = new ExceptionRaisingClass();
		e.unCheckedException();
		try {
			e.checkedException(); // required try-catch
		} catch (CheckedCustomException e1) {
			e1.printStackTrace();
		}
	}
}

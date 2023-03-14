package exceptionCases.custom;

public class NegativeException extends ClassCastException {

	public NegativeException() {
		super("+ve Value expected");
	}

	public NegativeException(String s) {
		super(s);
	}
}

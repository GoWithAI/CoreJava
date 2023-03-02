package exceptionCases.custom;

//to write a runtime exception  need to extend the RuntimeException
public class UnCheckedCustomException extends RuntimeException {

	public UnCheckedCustomException(String arg) {
		super(arg);
	}

}

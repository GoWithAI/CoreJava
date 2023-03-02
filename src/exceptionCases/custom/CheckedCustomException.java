package exceptionCases.custom;

// All exceptions must be a child of Throwable.
//Checked Exception - automatically enforced by the Handle or Declare Rule
public class CheckedCustomException extends Exception {

	public CheckedCustomException(String arg) {
		super(arg);
	}


}

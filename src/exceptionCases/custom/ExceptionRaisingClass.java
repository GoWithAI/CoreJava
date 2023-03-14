package exceptionCases.custom;


public class ExceptionRaisingClass {

	// IOException, ParaseExeption, ClassNotFoundException
	public void checkedException() throws CheckedCustomException{ // Compile should be handled
		throw new CheckedCustomException("Checked Exception!!!");
	}

	public void unCheckedException() { // it can happen at run time 
		throw new UnCheckedCustomException("UnChecked Exception!!!");
	}

}

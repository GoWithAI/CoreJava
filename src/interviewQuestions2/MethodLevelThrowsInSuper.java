package interviewQuestions2;

// https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/
abstract class SuperAB {
	void getName() throws Exception {

	}
	abstract void getNameD() throws Error;
	abstract void getID() throws ArithmeticException;
}

public class MethodLevelThrowsInSuper extends SuperAB{

	@Override
	void getName()  {}

	@Override
	void getNameD()  {}

	@Override
	void getID() {}
}


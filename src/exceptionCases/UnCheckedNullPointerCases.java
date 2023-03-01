package exceptionCases;

// Unchecked Exception - not checked by compiler at compile time
//null pointer exception in java is a runtime exception
// Hierarchy - Object > Throwable > Exception > RuntimeException > NullPointerException
//predictable, erroneous situation 
// an unchecked exception represents an error in programming logic, not an erroneous situation that might reasonably occur during the proper use of an API.
public class UnCheckedNullPointerCases {

	public static void main(String[] args) {
		Emp e = new Emp();
		e.getT().getJ(); // Null Point Exception - avoid by using check of null
	}

	public void arithmaticExce() {
		try {
			int num1 = 30, num2 = 0;
			int output = num1 / num2; // ArithmaticException
			System.out.println("Result: " + output);
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}
	}

}

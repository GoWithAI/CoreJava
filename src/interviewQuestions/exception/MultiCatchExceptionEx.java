package interviewQuestions.exception;

import java.io.IOException;

//Multi-catch exceptions
public class MultiCatchExceptionEx {

	static Integer i;

	public static void main(String[] args) {

		multiException();

		multiException2();
		
		multiException3();
		
		multiException4();

	}

	private static void multiException4() {
		try {
			throw new ArithmeticException();
		}
		//catch (ArrayIndexOutOfBoundsException | RuntimeException  e ) {} // compile time - due to Not allowed 1 or more exception of same hierarchy
		catch (ArrayIndexOutOfBoundsException | NullPointerException e) { // not in Same Hierarchy
		}
	}

	private static void multiException3() {
		try {
			System.out.println("A");
			throw new RuntimeException();
		}catch (Exception e) {	}
		//catch (RuntimeException e) {}//compile time error
		finally {
			System.out.println("F");
		}
	}

	// Precedence in catch should be Sub - Sub of Sub - Parent class at the end
	private static void multiException2() {
		try {
			throw new IOException();
			
		} //catch (RuntimeException e) {} // NullPointerException & ArithmeticException catch block is NOT Reachable - compile time error
		//catch (Throwable e) {}  // compile time Error - below code is not reachable
		//catch (Exception e) {}  // class which extended are not reachable 
		catch (OutOfMemoryError e) {

		}catch (IOException e) {

		} catch (NullPointerException e) {

		} catch (ArithmeticException e) {

		} catch (Exception e) {
		}
	}

	private static void multiException() {
		try {
			int x = 10;

			System.out.println(x / i.intValue());
			// below case already ArithmeticException | NullPointerException handling so
			// "Exception is not required"
			// } catch (Exception | ArithmeticException | NullPointerException e) {
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e instanceof ArithmeticException);
			System.out.println((e instanceof NullPointerException) + "      " + e.getClass().getSimpleName());
		}
	}

}

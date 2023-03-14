package interviewQuestions.exception;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class CatchVariableFinalEx {

	final static CatchVariableFinalEx f = new CatchVariableFinalEx();

	public static void main(String[] args) {
		exceptionVariableOutOfBox(args);
	}

	private static void exceptionVariableOutOfBox(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				try {
					Field declaredField = f.getClass().getDeclaredField("f");
					boolean fina1 = Modifier.isFinal(declaredField.getModifiers());
					System.out.println("f is final ? :" + fina1);

					// ********* here e is effectually final and can not be reassigned --- also we
					// are not able to check explicitly whether is final or not
					boolean catchVariableFinal = isCatchVariableFinal(e);
					System.out.println("catchVariableFinal :" + catchVariableFinal);
				} catch (NoSuchFieldException | SecurityException e1) {
					e1.printStackTrace();
				}
				// e is final so can not reassigned
				// e = new ArrayIndexOutOfBoundsException("Out of Bounds");
			} else if (e instanceof NullPointerException) {
				// e = new NullPointerException("Null Pointer");
			} else {
				// e = new ArithmeticException("Arithmatic");
			}

			System.out.println(e.getMessage());
		}
	}

	// e is final defined by JVM - so below case it will not return true
	private static boolean isCatchVariableFinal(Exception e) {
		Class<?> clazz = e.getClass();
		int modifiers = clazz.getModifiers();
		return Modifier.isFinal(modifiers);
	}
}

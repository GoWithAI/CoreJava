package ocajp.classDesign.localClass;

public class LocalClassExample {
	static String regularExpression = "[^0-9]";

	String nonStatic = "nonStaticVarible";

	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

		final int numberLength = 10;

		// Valid in JDK 8 and later:

		int numberLength2 = 7;// Effective Final
		// numberLength is a captured variable.

		// Local Class cannot define or declare any static members
		class PhoneNumber {

			// Not allowed to declare static variable in local/innerclass
			// static String formattedPhoneNumber2 = "Test";

			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				// numberLength2 = 7;
				System.out.println(numberLength2);
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;

				// not allowed to access non static inside static method (Hence inside of Local
				// class)
				// nonStatic = nonStatic + " ";
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}

			// Valid in JDK 8 and later:

			public void printOriginalNumbers() {
				System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// Valid in JDK 8 and later:

		myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());
		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());

		// static local class not permitted
		// static class PhoneNumber2 {}

		// abstract local class is permitted
		abstract class PhoneNumber2 {
		}

		final class PhoneNumber3 {
		}

		// Either final or Either abstract is allowed
		// abstract final class PhoneNumber4 {}
	}

	public void validatePhoneNumber2(String phoneNumber1, String phoneNumber2) {
		class PhoneNumber {
			// Not allowed to declare static variable in local/innerclass
			// static String formattedPhoneNumber2 = "Test";

			public PhoneNumber(String x) {
				System.out.println(nonStatic); // non static variable can be accessed
				System.out.println(regularExpression);
			}
		}

		// static local class not permitted
		// static class PhoneNumber2 {}

		// abstract local class is permitted
		abstract class PhoneNumber2 {
		}

		final class PhoneNumber3 {
		}

		// Either final or Either abstract is allowed
		// abstract final class PhoneNumber4 {}

		class PhoneNumber5 {
			// static is not allowed in Local Class
			// static void test() {}
		}
	}

	// You cannot declare an interface inside a block; interfaces are inherently
	// static
	public void greetInEnglish() {

		// interface HelloThere{public void greet();}

		class EnglishHelloThere {// implements HelloThere {
			public void greet() {

			}
		}
		// HelloThere myGreeting = new EnglishHelloThere();
		// myGreeting.greet();

	}

	public void constantAllowed() {
		class A {
			// static final allowed
			public static final String farewell = "Bye bye";

			public void sayGoodbye() {
				System.out.println(farewell);
			}
		}
		A a = new A();
		a.sayGoodbye();
	}

	public static void main(String... args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}

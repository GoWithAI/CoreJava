package java11.innerClasses;

/*
1.  static variable of outer class can be accessed by both static and non static classes
2.  non static variable of outer calss can be accessed by only non static class 
*/
public class AlphabetNestBasedAccessControl {

	private String name = "I am Alphabet";
	private static String nameS = "I am static Alphabet";

	private class A {
		public void printName() {
			System.out.println(name);
			System.out.println(nameS);
		}
	}

	private static class B {
		public void printNameStatic() {
			System.out.println(nameS);
			// System.out.println(name); // static class method can not access NON STATIC
			// variable of outer class
		}
	}

	public class Inner {
		void print() {
				System.out.println("Inner class");
		}
	}

	// non static class should be access from non static method
	public void nonStaticClassMethodCall() {
		A a = new A();
		a.printName();
		B b = new B(); // can access static class from static and non static method
		b.printNameStatic();
	}

	// non static class will not be accessed from static method
	public static void staticClassMethodCall() {
		//A a = new A();
		//a.printName();
		B b = new B();
		b.printNameStatic();
	}

	public static void main(String[] args) {
		AlphabetNestBasedAccessControl ab = new AlphabetNestBasedAccessControl();
		ab.nonStaticClassMethodCall();
		staticClassMethodCall();
		
		new AlphabetNestBasedAccessControl().new Inner().print();
	}
}

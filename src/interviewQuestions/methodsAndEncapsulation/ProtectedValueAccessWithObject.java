package interviewQuestions.methodsAndEncapsulation;

import interviewQuestions.inheritance.A2;

public class ProtectedValueAccessWithObject extends A2 {
	public static void main(String[] args) {
		ProtectedValueAccessWithObject p = new ProtectedValueAccessWithObject();
		p.print(0);
		p.print2(0);
	}

	public void print(int x) {
		A2 a = new A2(); // A2 is not different package
		// System.out.println(a.x);// compile time error - Not allowed to access through
		// object
		System.out.println(this.x); // 10
		System.out.println(this.x); // 0
	}

	public void print2(int y) {
		A2 a = new A2(); // A2 is not different package
		// System.out.println(a.x);// compile time error - Not allowed to access through
		// object
		System.out.println(x); // 10
	}
}

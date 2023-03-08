package interviewQuestions.inheritance;

interface I2 {
	void meth();
}

class A implements I2 {
	void A(String s) {}
	public void meth() {
		System.out.println("A");
	}
}

class C extends A implements I2 {
	public void meth() {
		System.out.println("C");
	}
}

public class InheritanceRuntimeExceptionEx {
	public static void main(String[] args) {
		A a = new A();
		C c1 = (C)a;
		c1.meth();
	}
}

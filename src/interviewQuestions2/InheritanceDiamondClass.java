package interviewQuestions2;

interface I1{

	default public void foo() {
		System.out.println("I1 foo");
	}
}

interface I2{

	default public void foo() {
		System.out.println("I2 foo");
	}
}

public class InheritanceDiamondClass implements I1, I2{

	//specify which default method from Interface is to be used 
	public static void main(String[] args) {
		
		InheritanceDiamondClass inheritanceDiamondClass = new InheritanceDiamondClass();
		inheritanceDiamondClass.foo();
	}

	@Override
	public void foo() {
		I1.super.foo();
		I2.super.foo();
	}

}

package interviewQuestions2;


interface I3{
	
	public void square(int a);
	
	static void show() {
		System.out.println("Static Method Executed");
	}
}

public class InheritanceDiamondClass3 implements I3{

	
	public static void main(String[] args) {
		InheritanceDiamondClass3 class3= new InheritanceDiamondClass3();
		class3.square(2);
		
		//show();// static method will not call in this case - compile time error
		I3.show();
	}

	@Override
	public void square(int a) {
		System.out.println(a*a);
	}

}

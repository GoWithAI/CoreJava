package interviewQuestions2;


class BaseClass{
	public void foo() {
		System.out.println("BaseClass's foo");
	}
}

interface BaseInterface{
	default public void foo() {
		System.out.println("BaseInterface foo");
	}
}

//compiler resolves to the definition in the class and the interface definition is ignored
public class InheritanceDiamondClass2 extends BaseClass implements BaseInterface {

	public static void main(String[] args) {

		new InheritanceDiamondClass2().foo();
	}

}

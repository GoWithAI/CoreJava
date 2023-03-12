package interviewQuestions.methodsAndEncapsulation;

public class FinalAbstractClass {
	
	public static void main(String[] args) {
		new FinalAbstractClass();
		new FinalAbstractClass2();
		new FinalAbstractClass3() {
			@Override
			void test() {
			}
		};
		// compile time error 3 & 4 case
		//new FinalAbstractClass3();
		//new FinalAbstractClass4();
		new FinalAbstractClass6() {
		};
		
	}
}

final class FinalAbstractClass2 {
}

abstract class FinalAbstractClass3 {
	abstract void test();
}

abstract class FinalAbstractClass4 {
	public FinalAbstractClass4() {
	}
}

abstract class FinalAbstractClass5 { // ?? - how to utilize - what is purpose of it to allow
	private FinalAbstractClass5() { // we are not able to extend or create object - either add another non private constructor and then extend 
	}
}

// 0 or more abstract methods is known as abstract class
abstract class FinalAbstractClass6 {
}

abstract class FinalAbstractClass7 {
	public void test7() {}
}

abstract class FinalAbstractClass8 {
	public abstract void test8();
}

abstract class FinalAbstractClass9 {
	public abstract void test9();
	public void test7() {}
}

// final mean class should not extend , if class is abstract then you should extend it - so it create contradicts ,Hence compile time error
//public final abstract class FinalAbstractClassSample { }
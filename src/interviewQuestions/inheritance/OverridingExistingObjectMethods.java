package interviewQuestions.inheritance;

interface I {
	int x = 10;
	static int y = 20;

	void declaration(); //override mandatory
	abstract void methodTest();//override mandatory
	static void methodTest2() {} 
	//void methodTest3() {} // Not allowed - instance methods are not allowed in interface
	//abstract void methodTest4() {} // Not allowed
	
	
	public default int getValue() {
		return 5;
	}

	// Overloading of default method
	public default int getValue(int i) {
		return 5;
	}

	public default String toString2() { // toString()
		return "I";
	}// we should not override methods from Object class here - toString()
}

public class OverridingExistingObjectMethods {
	public static void main(String[] args) {
		I i = new I() {
			@Override
			public void declaration() {}
			@Override
			public void methodTest() {}
		};
		System.out.println(I.x + i.getValue() + "" + i);

		System.out.println(I.x);
		System.out.println(I.y);
	}
}

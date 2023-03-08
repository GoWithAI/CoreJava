package interviewQuestions.inheritance;

interface Int1 {
	static void print() {
		System.out.println("int1");
	}
}

interface Int2 extends Int1{
	static void print() {
		System.out.println("Int2");
	}
}

public class StaticOverrideInInterface {
	public static void main(String[] args) {

		Int1.print();
		Int2.print();
	}
}

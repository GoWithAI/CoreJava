package interviewQuestions.methodsAndEncapsulation;

class StaticFinalData {
	// static variable - compile time loaded in memory , only one copy available
	// final once declared can not be changes
	static final int intConstant = 20;
}

public class StaticFinalVarible {
	public static void main(String[] args) {
		StaticFinalData s = new StaticFinalData();
		System.out.println(s.intConstant);

		StaticFinalData s2 = new StaticFinalData();
		// s2.intConstant = 40; // perfect not allowed here
		System.out.println(s2.intConstant);
	}
}

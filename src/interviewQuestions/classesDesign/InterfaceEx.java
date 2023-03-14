package interviewQuestions.classesDesign;

interface IntEx {
	static final int speed = 80;

	String s = "speed";
}

public class InterfaceEx {
	public static void main(String[] args) {
		//IntEx.speed = 1;
		//IntEx.s = "Test";
		System.out.println(IntEx.s);
	}
}

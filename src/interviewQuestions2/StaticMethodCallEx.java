package interviewQuestions2;

public class StaticMethodCallEx {

	public static void main(String[] args) {
		staticMethodCallMe();
		//Not best Approach
		StaticMethodCallEx callEx = new StaticMethodCallEx();
		callEx.staticMethodCallMe();
		StaticMethodCallEx.staticMethodCallMe();
	}
	
	public static void staticMethodCallMe() {
		System.out.println("Static Method");
	}

}

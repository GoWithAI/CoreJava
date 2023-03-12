package interviewQuestions.methodsAndEncapsulation;

class AB {
	public int cal(int a, int b) {
		return a + b;
	}
}

class BC extends AB {
	// compile time - return type is not compatible  AB 
	//public void cal(int a, int b) {	}
	public double cal(double a, double b) {
		return a + b;
	}
}

public class OverridingIssueEx {

	public static void main(String[] args) {
		AB a = new AB();
		// Overriding checks method name and Signature 
		//System.out.println(a.cal(2.0, 4.1));
	}

}

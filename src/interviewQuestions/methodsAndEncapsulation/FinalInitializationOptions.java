package interviewQuestions.methodsAndEncapsulation;

// Different way to initialize final variables
public class FinalInitializationOptions {
	//1
	final int num = 10 ;
	// 2. with final method final can be initialized
	final int num2 = getValue() ;
	//3
	final int num3 ;
	//4
	final int num4; {
	      num4 = 500;
	   }
	public FinalInitializationOptions(int n) {
		num3 = n;
	}
	
	public static final int getValue() {
		return 20;
	}
	
	public static void main(String[] args) {
	FinalInitializationOptions f = new FinalInitializationOptions(5);
	System.out.println(f.num);
	
	}
}

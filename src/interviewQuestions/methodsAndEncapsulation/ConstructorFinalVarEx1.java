package interviewQuestions.methodsAndEncapsulation;

class Data {
	//final var can be initialized at instance level or constructor since those places initialized once only
	// but method can be called multiple times on same object - which leads/canbe re-initialization final variable for each call
	// so language designer decided to give Compile time error
	 final int num; // Object level Initialization 
	 
	 // static is class Level and final mean it should not changes - static final combo 
	 //so, 1. object level initialization is not allowed due to avoid re-initialization in constructor / method in case of multiple object creation. 
	 // 2. Only allowed instance Level initialization
	 static final int num2 = 10;
	 
	 static final int num3;
	 
	 static {
		 num3 = 20;
	 }

	Data(int i) {
		num = i;
	}
	
	
	//public void insta() {num = 10;}
	
	//public static void insta() {	num = 10;}
	
}

public class ConstructorFinalVarEx1 {
	public static void main(String[] args) {
		Data d = new Data(9);
	}
}

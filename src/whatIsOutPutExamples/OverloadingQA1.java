package whatIsOutPutExamples;

/**
 * Overloading method name same and method signature and return time can be different
 * Overload does not consider return type
 * */

public class OverloadingQA1 {

	public static void main(String[] args) {
		
	}
	
	public int getA(int i) {
		return 2;
	}
	
	/*
	 * Invalid
	public void getA(int i) {
		return 2;
	}
	*/
	// Does not matter return type but method parameter type String 
	public String getA(String i) {
		return i;
	}

}

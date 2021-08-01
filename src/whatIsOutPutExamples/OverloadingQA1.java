package whatIsOutPutExamples;

/**
 * Overloading method name same and method signature and return time can be different
 * 
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
	
	public String getA(String i) {
		return i;
	}

}

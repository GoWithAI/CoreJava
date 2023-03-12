package interviewQuestions.methodsAndEncapsulation;

public class PrimitivePassByValue {

	public static void main(String[] args) {
		int[] ary = { 1, 2, 3 };
		change(ary[2]); // pass by value
		change(ary); // pass by ref
		System.out.println(ary[1] + ary[2]);
	}

	public static void change(int x) { // pass by value
		x = 1;
	}
	public static int change(int x[]) {
		x[1] = 0;
		return 1;
	}

}

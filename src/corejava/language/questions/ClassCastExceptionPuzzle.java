package corejava.language.questions;

public class ClassCastExceptionPuzzle {
	public static void main(String[] args) {
		Object obj = new Integer(3);
		String str = (String) obj;
		System.out.println(str);
	}

}
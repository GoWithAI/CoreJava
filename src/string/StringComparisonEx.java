package string;

public class StringComparisonEx {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		System.out.println("s1 == s2 -> " + (s1 == s2));
		System.out.println("s1.equals(s2) -> " + s1.equals(s2));

		String s3 = new String("Hello");
		String s4 = new String("Hello");

		System.out.println("s3 == s4 -> " + (s3 == s4));
		System.out.println("s3.equals(s4) -> " + s3.equals(s4));

		System.out.println(" s1 == s3 ->" + (s1 == s3));
		System.out.println(" s1.equals(s3) ->" + s1.equals(s3));

		System.out.println(s3 == "Hello"); // here "Hello" is string literal
		// Compares two strings lexicographically ?
		s1.compareTo(s4);

		// intern will check if already "Hello" is in String Pool
		// If yes then return reference
		// if no then put value in String pool
		String s5 = new String("Hello").intern();
		System.out.println("s1==s5 ->  " + (s1 == s5)); // true
		System.out.println(s1.equals(s5));
	}

}

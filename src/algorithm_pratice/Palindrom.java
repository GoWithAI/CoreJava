package algorithm_pratice;

public class Palindrom {

	public static void main(String[] args) {
		boolean value = isPalindrome("aba");
		System.out.println(value);

	}

	public static boolean isPalindrome(String word) {

		char[] charArray = word.toCharArray();
		for (int start = 0, end = word.length() - 1; start < end; ++start, --end) {
			// check if the two values are not the same
			if (charArray[start] != charArray[end])
				return false;
		}
		return true;
	}

}

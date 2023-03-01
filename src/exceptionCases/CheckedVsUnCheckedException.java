package exceptionCases;

public class CheckedVsUnCheckedException {

	public static void main(String[] args) {

		try {
			Class.forName("com.xyz"); // Mandatory to Handle CHECKED  EXCEPTION - Should be handled 
		} catch (ClassNotFoundException e) {
			System.out.println("Class was not found.");
		}

		String input = null;
		input.length(); //UNCHECKED EXCEPTION ( nullpointerexception at run time )-  throws an unchecked exception

	}

}

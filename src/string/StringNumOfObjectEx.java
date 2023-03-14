package string;

public class StringNumOfObjectEx {

	// 4 Object of String created in Pool
	public static void main(String[] args) {
		String s = "Test"; // 1
		s.concat("Lab"); // 2 string created in pool
		s.toLowerCase(); // 1
		System.out.println(s);// Test ??? - not reassigned

	}

}

package interviewQuestions1;

import java.util.HashMap;

public class ImmutableClassEx {

	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy
	 * for creating immutable classes
	 * 
	 */
	public static void main(String[] args) {

		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		ImmutableClass ic = new ImmutableClass(i, s, h1);

		// Lets see whether its copy by field or reference
		System.out.println("String Equal : " + (s == ic.getName()));
		System.out.println("Object Cloned Equal :" + (h1 == ic.getTestMap()));
		// print the ce values
		System.out.println("ic id:" + ic.getId());
		System.out.println("ic name:" + ic.getName());
		System.out.println("ic testMap:" + ic.getTestMap());

		// change the local variable values
		System.out.println("**************change the local variable values******************");

		i = 20;
		s = "modified";
		h1.put("3", "third"); 
		System.out.println("ic id after local variable change:" + ic.getId());
		System.out.println("ic name after local variable change:" + ic.getName());
		System.out.println("ic testMap after local variable change:" + ic.getTestMap());

		HashMap<String, String> hmTest = ic.getTestMap();
		hmTest.put("4", "new");

		System.out.println("ce testMap after changing variable from accessor methods:" + ic.getTestMap());

	}

}

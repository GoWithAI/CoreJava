package arrays;

import java.util.Arrays;

public class JavaArraysDeepequals {

	public static void main(String[] args) {
		Object[] anArray = new Object[] { "string1", "string2", "string3" };
		Object[] anotherArray = new Object[] { "string1", "string2", "string3" };

		System.out.println(Arrays.equals(anArray, anotherArray));
		System.out.println(Arrays.deepEquals(anArray, anotherArray));

		Object[] anArray1 = new Object[] { "string1", null, "string3" };
		Object[] anotherArray1 = new Object[] { "string1", null, "string3" };

		System.out.println(Arrays.equals(anArray1, anotherArray1));
		System.out.println(Arrays.deepEquals(anArray1, anotherArray1));

		Object[] anArray2 = new Object[] { "string1", null, new String[] { "nestedString1", "nestedString2" } };
		Object[] anotherArray2 = new Object[] { "string1", null, new String[] { "nestedString1", "nestedString2" } };
		
		System.out.println(Arrays.equals(anArray2, anotherArray2));
		//deepEquals calls itself recursively when encountering an array,
		System.out.println(Arrays.deepEquals(anArray2, anotherArray2));
		
		int[][] anArray3 = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };
	    int[][] anotherArray3 = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };
	    System.out.println(Arrays.equals(anArray3, anotherArray3));
		//deepEquals calls itself recursively when encountering an array,
		System.out.println(Arrays.deepEquals(anArray3, anotherArray3));
	}

}

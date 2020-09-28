package arrays;

import java.util.Arrays;

public class UserDefinedObjectsArray {

	public static void main(String[] args) {

		Person personArray1[][] = { { new Person(1, "John", 22), new Person(2, "Mike", 23) },
				{ new Person(3, "Steve", 27), new Person(4, "Gary", 28) } };
		Person personArray2[][] = { { new Person(1, "John", 22), new Person(2, "Mike", 23) },
				{ new Person(3, "Steve", 27), new Person(4, "Gary", 28) } };

		System.out.println("equals:" + Arrays.equals(personArray1, personArray2));
		System.out.println("deepEquals:" + Arrays.deepEquals(personArray1, personArray2));
	}

}

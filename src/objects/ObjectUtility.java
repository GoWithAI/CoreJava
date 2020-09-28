package objects;

import java.util.Objects;

public class ObjectUtility {

	public static void main(String[] args) {

		Object a = "deep";
		Object b = "deep2";
		Object c = null;

		System.out.println("equals:" + Objects.equals(a, b));
		System.out.println("hash:" + Objects.hash(a, b));
		System.out.println("hashCode:" + Objects.hashCode(b));

		System.out.println("isNull:" + Objects.isNull(c));

		System.out.println("nonNull:" + Objects.nonNull(b));
		System.out.println("requireNonNull:" + Objects.requireNonNull(b));// check for null or throw null pointer
																			// exception		
		
		String s1 = "testStr";
        String s2 = "testStr2";
		System.out.println("deepEquals:" + Objects.compare(s1, s2,  String::compareTo));

		
		System.out.println("deepEquals:" + Objects.deepEquals(a, b));
	}

}

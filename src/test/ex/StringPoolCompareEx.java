package test.ex;

public class StringPoolCompareEx {

	public static void main(String[] args) {

		String s1 = "hi";
		String s2 = new String("hi");
		System.out.println(s1);
		System.out.println(s1 == s2); //?
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() +" + "+ s2.hashCode());
		
	}

}

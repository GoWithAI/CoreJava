package java11;

public class AlphabetNestBasedAccessControl {

	private String name = "Dipak";

	public class A {

		public void print() {
			System.out.println(name);
		}
	}

}

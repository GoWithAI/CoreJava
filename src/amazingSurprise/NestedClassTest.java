package amazingSurprise;

public class NestedClassTest {

	private static int value = 20;
	public int s = 15;
	public static int temp = 10;

	public static class Nested {
		private void display() {
			// s = ""; // try to access not static
			System.out.println(temp + value);
		}
	}

	public class Nested2 {
		private void display() {
			System.out.println(temp + s + value);
		}
	}

	public static void main(String args[]) {
		NestedClassTest.Nested inner = new NestedClassTest.Nested();
		inner.display();
	}

}

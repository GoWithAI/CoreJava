package amazingSurprise;

class Super2 {
	private void abc() {
		System.out.println("abc");
	}
}

public class PrivateMethodIn extends Super2 {
	private void abc() {
		System.out.println("abc");
	}

	public static void main(String[] args) {
		Super2 s = new PrivateMethodIn();
		// comiple time
		// s.abc();
	}
}

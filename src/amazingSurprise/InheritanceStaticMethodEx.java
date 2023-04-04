package amazingSurprise;

class Super {
	public static void write() {
		System.out.println("Super");
	}
}

class Child extends Super {
	public static void write() {
		System.out.println("Child");
	}
}

class Child2 extends Child {
	public static void write() {
		System.out.println("Child2");
	}

	public static void read() {
		System.out.println("Child2:read");
	}
}

public class InheritanceStaticMethodEx {

	public static void main(String[] args) {
		Child c = new Child2();
		c.write(); // If we remove write() from Child class then Super:write method is getting called 

	}

}

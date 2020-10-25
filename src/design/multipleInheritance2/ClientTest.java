package design.multipleInheritance2;

public class ClientTest implements Interface1, Interface2, Interface3 {

	// Override default method in class
	@Override
	public void methodA() {
		System.out.println("methodA : " + ClientTest.class);
	}

	public static void main(String[] args) {
		ClientTest ct = new ClientTest();
		ct.methodA();
		// 1. First invoke Current Class
		// 2. invoke in interface2
		// 3. invoke in interface1
		ct.methodB();
		ct.methodC();

	}

}

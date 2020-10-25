package design.multipleInheritance;

public class ClientTest implements Interface1, Interface2, Interface3 {

	public static void main(String[] args) {
		ClientTest ct = new ClientTest();
		ct.methodA();
		ct.methodB();
		ct.methodC();

	}

}

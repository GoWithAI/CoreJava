package design.multipleInheritance.Conflict;

public class ClientTest implements Interface1, Interface2 {

	// Duplicate default methods named methodA with the parameters () and () are
	// inherited from the types Interface2 and Interface1
	// Solution below
	// Override method and mention which method of interface needs to call
	@Override
	public void methodA() {
		Interface1.super.methodA();
	}

	public static void main(String[] args) {
		ClientTest ct = new ClientTest();
		ct.methodA();
	}

}

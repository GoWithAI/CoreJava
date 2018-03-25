package unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		printMessage();
		Thread t = new Thread(MethodReferenceExample1::printMessage);// MethodReferenceExample1::printMessage method
																		// reference 
		t.start();

		Thread t2 = new Thread(() -> printMessage());// t1 and t2 are same method referenceing 
		t2.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}

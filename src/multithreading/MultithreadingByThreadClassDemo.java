package multithreading;

public class MultithreadingByThreadClassDemo extends Thread {

	@Override
	public void run() {
		System.out.println(1);
	}

	public static void main(String[] args) {

		MultithreadingByThreadClassDemo t = new MultithreadingByThreadClassDemo();

		t.start();

	}

}

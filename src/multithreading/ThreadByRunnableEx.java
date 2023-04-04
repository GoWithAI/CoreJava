package multithreading;

public class ThreadByRunnableEx implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadByExtendingThreadEx(), "Name");
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Run");
	}

}

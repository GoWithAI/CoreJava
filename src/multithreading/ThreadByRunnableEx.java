package multithreading;

public class ThreadByRunnableEx implements Runnable {

	@Override
	public void run() {
		System.out.println("Run");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadByExtendingThreadEx(), "Thread-Name");
		t.start();
	}
}

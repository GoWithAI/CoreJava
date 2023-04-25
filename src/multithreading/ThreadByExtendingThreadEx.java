package multithreading;

public class ThreadByExtendingThreadEx extends Thread {

	@Override
	public void run() {
		System.out.println("run");
	}

	public static void main(String[] args) {
		ThreadByExtendingThreadEx t = new ThreadByExtendingThreadEx();
		t.start();
	}
}

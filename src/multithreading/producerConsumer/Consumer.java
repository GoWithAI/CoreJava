package multithreading.producerConsumer;

public class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		while (true) {
			int i = q.get();

		}
	}

}

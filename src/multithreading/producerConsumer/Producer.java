package multithreading.producerConsumer;

public class Producer implements Runnable {

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {

		int data = 0;

		while (true) {
			q.put(data++);
		}

	}

}

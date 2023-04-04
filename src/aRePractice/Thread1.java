package aRePractice;

public class Thread1 extends Thread {

	OddEven q;

	public Thread1(OddEven q) {
		this.q = q;
	}

	@Override
	public void run() {
		while (q.balance < 10)
			try {
				q.test();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

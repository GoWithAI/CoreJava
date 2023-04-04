package aRePractice;

public class Thread2 extends Thread {

	OddEven q;

	public Thread2(OddEven q) {
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

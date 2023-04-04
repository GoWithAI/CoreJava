package aRePractice;

public class OddEven {

	int balance;
	boolean isDataRead;

	boolean isWait = true;

	public synchronized void test() throws InterruptedException {
		if (isWait) {
			isWait = false;
			wait();
		}
		balance++;
		notify();
		isWait = true;
		System.out.println(Thread.currentThread().getName() + " ::  " + balance);
	}

}

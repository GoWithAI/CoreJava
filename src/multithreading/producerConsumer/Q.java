package multithreading.producerConsumer;

public class Q {

	int balance;

	boolean isUpdatedValue = false;

	// p
	public synchronized void put(int balance) {
		try {
			if (isUpdatedValue) { //false
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
		System.out.println("put : " + balance);
		isUpdatedValue = true;
		notify();
	}

	// c
	public synchronized int get() {

		try {
			if (!isUpdatedValue) {  // true
				wait();//c
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("get : " + balance);
		isUpdatedValue = false;
		notify();
		return balance;
	}

}

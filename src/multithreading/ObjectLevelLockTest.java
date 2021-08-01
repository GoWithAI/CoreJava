package multithreading;

/**
 * Object level lock is mechanism when we want to synchronize a non-static
 * method or non-static code block such that only one thread will be able to
 * execute the code block on given instance of the class. This should always be
 * done to make instance level data thread safe.
 * 
 */
public class ObjectLevelLockTest implements Runnable {

	// object level lock
	public synchronized void demoMethod() {
	}

	// object level
	public void demoMethod2() {

		System.out.println("Thread =" + Thread.currentThread().getName());

		synchronized (this) {
			// thread safe code
			System.out.println("synchronized start=" + Thread.currentThread().getName());
			System.out.println("synchronized end  =" + Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {

		ObjectLevelLockTest obj1 = new ObjectLevelLockTest();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);

		ObjectLevelLockTest obj2 = new ObjectLevelLockTest();
		Thread t3 = new Thread(obj2);

		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");

		// obj1 t1 and t2 accesses synchronously
		t1.start();
		t2.start();
		// will operate on obj2 independent of t1 and t2
		t3.start();

	}

	@Override
	public void run() {
		demoMethod2();
	}

}

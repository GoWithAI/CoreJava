package multithreading;

/**
 * Once a thread got the class level lock, then it is allowed to execute any
 * static synchronized method of that class. Once method execution completes
 * automatically thread releases the lock. The Class level lock prevents
 * multiple threads to enter in a synchronized block in any of all available
 * 
 */

/**
 * Class level locking should always be done to make static data thread safe. As
 * we know that static keyword associate data of methods to class level, so use
 * locking at static fields or methods to make it on class level.
 **/
public class ClassLevelLockTest implements Runnable {

	public synchronized static void demoMethod() {

	}

	// object level
	public void demoMethod2() {

		System.out.println("Thread =" + Thread.currentThread().getName());

		synchronized (ClassLevelLockTest.class) {
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

		//
		t1.start();
		t2.start();
		//
		t3.start();

	}

	@Override
	public void run() {
		demoMethod2();
	}
}

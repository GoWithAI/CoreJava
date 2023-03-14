package design.designPattern.singleton;

//
public class SingletonDoubleCheckLocking {

	private volatile  static SingletonDoubleCheckLocking instance;

	private SingletonDoubleCheckLocking() {

	}

	// getInstance is not synchronized but the block which creates instance is
	// synchronized so that minimum number of threads have to wait and that�s only
	// for first time. Also Reduced Overhead if synchronization block instead of method
	public static SingletonDoubleCheckLocking getInstance() {

		if (instance == null) {
			// we could instead start by verifying if we need to create the object in the
			// first place and only in that case we would acquire the lock.
			synchronized (SingletonDoubleCheckLocking.class) { // Only First time Threads will wait
				if (instance == null) {
					instance = new SingletonDoubleCheckLocking();
				}
			}
		}
		return instance;

	}

}

package collections.concurrentReentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

//ReentrantLock has support for configurable fairness policy
//We hold the lock across the method
//timed lock waits, interruptible lock waits, non-block-structured locks, multiple condition variables, or lock polling
public class ReenTrantLockEx {

	ReentrantLock lock = new ReentrantLock();

	// lock fairness - In Wait Queue waiting state thread FIFO base thread has high
	// chance to get lock after current thread unlock
	ReentrantLock lockFairness = new ReentrantLock(true);

	// Wait Queue some thread might need to wait and new thread just come who is not
	// in Queue might directly get lock after unlocking of current thread
	ReentrantLock lockUnFair = new ReentrantLock(false);

	// Lock are explicit
	// locks allows locking/unlocking in any scope and in any order -
	// ability
	private void accessResource() {

		lock.lock();
		// access shared resource

		// advisable due to if any exception all other threads goes in wait state and
		// will not runnable
		try {

		} catch (Exception e) {

		} finally {
			lock.unlock();
		}

		// lock.unlock();
	}

	// In recursive call lock internally maintain only count of lock but originally
	// only 1 lock
	// t1 thread calling method which already has lock and access to it( and lock
	// lock within it) thats why we call ReentrantLock
	private void accessResource2() {

		lock.lock();

		// update shared resource

		if (true)
			accessResource2();

		int holdCount = lock.getHoldCount();

		lock.unlock();

	}

	private void accessResource3() throws InterruptedException {

		// If within 5s if acquired lock then do if block else do something else
		//
		boolean lockAcquired = lock.tryLock(5, TimeUnit.SECONDS);

		if (lockAcquired) {

			try {
				lock.isHeldByCurrentThread();
				lock.getQueueLength();
				// access resource
			} finally {
				lock.unlock();
			}

		} else {
			// do somthing else
		}

	}

	// limitations in implicit lock and unlock case
	// synchronized doesn't support thread scheduling
	private void accessSychronizedResource() {
		synchronized (this) {

		}
	}

	private void accessConcurrently() {
		Thread t1 = new Thread(() -> accessResource());
		t1.start();
		Thread t2 = new Thread(() -> accessResource());
		t2.start();
		Thread t3 = new Thread(() -> accessResource());
		t3.start();
		Thread t4 = new Thread(() -> accessResource());
		t4.start();
	}

	public static void main(String[] args) {

	}

}

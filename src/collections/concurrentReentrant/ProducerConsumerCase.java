package collections.concurrentReentrant;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerCase {

	private Lock lock = new ReentrantLock();
	private Condition added = lock.newCondition();
	private Condition removed = lock.newCondition();
	private Integer MAX_COUNT = 10;
	private Integer count = 0;

	BlockingQueue<String> bq = new ArrayBlockingQueue<String>(MAX_COUNT);

	public void produce() throws InterruptedException {
		lock.lock();

		try {

			while (count == MAX_COUNT) // Queue is full
				removed.await();
			addData();
			added.signal();
		} finally {
			lock.unlock();
		}
	}

	public String consumer() throws InterruptedException {
		lock.lock();

		try {

			while (count == 0) // Queue is Empty
				added.await();

			String data = getData();
			removed.signal();
			return data;

		} finally {
			lock.unlock();
		}
	}

	private String getData() {
		String remove = bq.remove();
		return remove;
	}

	private void addData() {
		bq.add("deepak");
	}

	public static void main(String[] args) {

	}

}

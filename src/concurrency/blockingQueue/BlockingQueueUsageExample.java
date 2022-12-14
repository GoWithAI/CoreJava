package concurrency.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueUsageExample {

	public static void main(String[] args) throws InterruptedException {

		boundedBlockingQueue();
		unboundedBlockingQueue();
		
	
	}

	//unbounded blocking Queue where size is not fixed
	private static void unboundedBlockingQueue() {
		BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>();
	}

	private static void boundedBlockingQueue() throws InterruptedException {
		//bounded blocking queue where the size is fixed - FIFO rule
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
		
		blockingQueue.put("enqueue-1");
		blockingQueue.put("enqueue-2");
	
		String dequeue = blockingQueue.take();
		String dequeue2 = blockingQueue.take();
		
		System.out.println(dequeue);
		System.out.println(dequeue2);
	}

}

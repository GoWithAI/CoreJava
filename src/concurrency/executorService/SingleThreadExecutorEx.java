package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorEx {

	static Runnable task = () -> {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name > "+threadName);
	};
	
	public static void main(String[] args) {

		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		ex.submit(task);

	}

}

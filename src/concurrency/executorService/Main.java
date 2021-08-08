package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		
		Future<Integer> submit = newFixedThreadPool.submit(new TaskCallable());
		
		
	}
	
}

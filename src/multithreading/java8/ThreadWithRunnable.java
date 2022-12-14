package multithreading.java8;

public class ThreadWithRunnable {

	public static void main(String[] args) {

		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread Name > "+threadName);
		};
		
		Runnable task2 = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread Name > "+threadName);
		};
		
		task.run();
		
		Thread t1 = new Thread(task , "Thread-1");
		t1.start();
		
		Thread t2 = new Thread(task , "Thread-2");
		t2.start();
		
	}

}

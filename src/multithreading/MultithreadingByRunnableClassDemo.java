package multithreading;

public class MultithreadingByRunnableClassDemo implements Runnable{

	@Override
	public void run() {
	System.out.println(1);	
	}
	
	public static void main(String[] args) {
		
		MultithreadingByRunnableClassDemo demo = new MultithreadingByRunnableClassDemo();
		
		Thread t = new Thread(demo);
		
		t.start();
	}
}

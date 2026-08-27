package corejava.concurrency.threads;

public class SynchronizedCounter {
	public int count = 1;

	public synchronized void m1(String name) {
		
		System.out.println(name + "  == " + count);
		count++;
	}
}

package whatIsOutPutExamples;

public class ThreadWithSync extends Thread{
	 
	int count = 0;
	
	@Override
	public synchronized void start() {
		count = count +1;
		System.out.println(getName()+"  "+ count);
	}
	
	public static void main(String[] args) {
		
		ThreadWithSync t = new ThreadWithSync();
		ThreadWithSync t2 = new ThreadWithSync();

		t.start();
		t2.start();
		
	}

}

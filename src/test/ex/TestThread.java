package test.ex;

import java.util.ArrayList;
import java.util.List;

public class TestThread extends Thread{

	 
	 
	int count = 0;
	
	@Override
	public synchronized void start() {
		count = count +1;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		TestThread t = new TestThread();
		TestThread t2 = new TestThread();

		t.start();
		t2.start();
		
	}

}

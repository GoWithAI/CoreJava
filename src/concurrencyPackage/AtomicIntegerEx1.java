package concurrencyPackage;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx1 {

	public static void main(String[] args) throws InterruptedException {
		AtomicInteger counter = new AtomicInteger();
		
		while(true) {
			System.out.println(counter.incrementAndGet());
			Thread.sleep(500);
		}
	}

}

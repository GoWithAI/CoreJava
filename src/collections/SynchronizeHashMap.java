package collections;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * 1. synchronizedMap can make Map object Synchronized - all method will be synchronized
 * Thread Safety , Negative Performance , data consistent in MultiThreaded Environment
 * 
 *  2. HashMap - High Performance , Not Thread safe - data might inconsistent in Multithread env( how ?)
 * 
 * **/
public class SynchronizeHashMap {

	private static AtomicInteger counter = new AtomicInteger();

	

	public static void main(String[] args) throws InterruptedException {
		Map<Integer, Integer> m = new HashMap<>();
		
		
		Map<Integer, Integer> map = Collections.synchronizedMap(m); // all object and its method got synchronized
		//Map<Integer, Integer> map = new HashMap<>();
		
		
		Date date = new Date();
		long start = date.getTime();
		final ExecutorService e = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 50000; i++) {
			e.execute(() -> {map.put(counter.incrementAndGet(), (int) (Math.random() * 100));
			System.out.println(Thread.currentThread());
			});
		}
		e.shutdown();
		e.awaitTermination(1000, TimeUnit.SECONDS);
		Date date2= new Date();
		long end = date2.getTime();
		System.out.println(map.size()  +" HashMap vs synchronizedMap Time Diff:" + (end - start));// should be 10000
	}
}

package collections.concurrency;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SumInParallelWithConcurrentHashMap {

	public static void main(String[] args) throws InterruptedException {

		Map<String, Integer> map = new ConcurrentHashMap<>();
		
		List<Integer> sumList = ConcurrentLogic.parallelSum(map, 1000);
		
		long count = sumList.stream().distinct().count();
		System.out.println("expected 1 : " + count);
		long count1 = sumList.stream().filter(num -> num != 100).count();
		System.out.println("expected > 0 : " + count1);
		
		//ConcurrentMap does not allow null key or value
		Map<String, Integer> map2 = new ConcurrentHashMap<>();
		//map2.put(null, new Object()); //Compile time 
		//map2.put("", null); // java.lang.NullPointerException
		
		
		Map<String, Object> map3 = new ConcurrentHashMap<>();
		Object object = new Object();
		map3.put("test", object);
		map3.compute("test", (s, o) -> null);
		System.out.println(map3.get("test"));
	}

}

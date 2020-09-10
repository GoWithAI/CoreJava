package collections.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumInParallelWithHashMap {

	public static void main(String[] args) throws InterruptedException {

		Map<String, Integer> map = new HashMap<String, Integer>();

		List<Integer> sumList = ConcurrentLogic.parallelSum(map, 100);

		long count = sumList.stream().distinct().count();
		System.out.println("expected 1 : " + count);

		long count1 = sumList.stream().filter(num -> num != 100).count();
		System.out.println("expected > 0 : " + count1);

	}

}

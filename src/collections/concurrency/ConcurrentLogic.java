package collections.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentLogic {

	static List<Integer> parallelSum(Map<String, Integer> map, int executionTime) throws InterruptedException {

		List<Integer> sumList = new ArrayList<Integer>(1000);

		for (int i = 0; i < executionTime; i++) {
			map.put("test", 0);
			ExecutorService executorService = Executors.newFixedThreadPool(4);

			for (int j = 0; j < 10; j++) {
				executorService.execute(() -> {
					for (int k = 0; k < 10; k++) {
						map.computeIfPresent("test", (key, value) -> value + 1);
					}
				});
			}
			executorService.shutdown();
			executorService.awaitTermination(5, TimeUnit.SECONDS);
			sumList.add(map.get("test"));
		}
		return sumList;
}
}

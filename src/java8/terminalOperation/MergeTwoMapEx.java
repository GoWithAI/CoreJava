package java8.terminalOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMapEx {

	public static void main(String[] args) {
		Map<String, Employee2> map1 = new HashMap<>();
		Map<String, Employee2> map2 = new HashMap<>();

		Employee2 employee1 = new Employee2(1L, "Deepak");
		Employee2 employee2 = new Employee2(22L, "DH");
		Employee2 employee3 = new Employee2(8L, "Joy");

		map1.put(employee1.getName(), employee1);
		map1.put(employee2.getName(), employee2);
		map1.put(employee3.getName(), employee3);

		Employee2 employee4 = new Employee2(2L, "GEM");
		Employee2 employee5 = new Employee2(3L, "Deepak");
		map2.put(employee4.getName(), employee4);
		map2.put(employee5.getName(), employee5);

		mergeIntoThrid(map1, map2);
		streamConcatMap(map1, map2);

	}

	private static void streamConcatMap(Map<String, Employee2> map1, Map<String, Employee2> map2) {
		// In case of same key - while merging consider this
		BinaryOperator<Employee2> binaryOper = (v1, v2) -> new Employee2(v1.getId() + v2.getId(), v2.getName());
		Map<String, Employee2> mergedMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, binaryOper, HashMap::new));
		System.out.println(mergedMap);
		System.out.println(mergedMap.get("Deepak").getId() + "     " + mergedMap.get("Deepak").getName());
	}

	private static void mergeIntoThrid(Map<String, Employee2> map1, Map<String, Employee2> map2) {
		System.out.println(map1);
		System.out.println(map2);
		Map<String, Employee2> map3 = new HashMap<>(map1);
		System.out.println(map3);

		map2.forEach((key, value) -> {
			// v1 and v2 are 2 object are getting merged in to single
			map3.merge(key, value, (v1, v2) -> new Employee2(v1.getId() + v2.getId(), v2.getName() + "-Merge"));
		});

		System.out.println(map3.get("Deepak").getId() + "   " + map3.get("Deepak").getName());
	}

}

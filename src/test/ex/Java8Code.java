package test.ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java8Code {

	public static void main(String[] args) {

		Object[] asList = Arrays.asList(1, 2, 2, 33, 33, 33, 44, 44, 44, 58, 87, 87).toArray();

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < asList.length; i++) {
			String keyMap = String.valueOf(asList[i]);
			if (map.containsKey(keyMap)) {
				Integer integer = map.get(keyMap);
				map.put(keyMap, integer + 1);
			} else {
				map.put(keyMap, 1);
			}
		}
		findListRepetated(map);
		// findListRepetated(asList);
	}

	private static void findListRepetated(Map<String, Integer> map) {
		for (Entry<String, Integer> mapE : map.entrySet()) {
			System.out.println(mapE.getKey() + "    " + mapE.getValue());
		}

		map.entrySet().stream().forEach(c -> {
			System.out.println(c.getKey() + "  -  " + c.getValue());
		});

		List<Entry<String, Integer>> collect = map.entrySet().stream().collect(Collectors.toList());
		System.out.println(collect);

		Map<String, Integer> collect2 = map.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println(collect2);
		
		// BiFunction<Integer, Integer, Integer> which accepts and returns the same type, can be replaced with BinaryOperator<Integer>
		BinaryOperator<Integer> mergeFunction = (e1, e2) -> e1;
		
		LinkedHashMap<String, Integer> collect3 = map.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, mergeFunction, LinkedHashMap::new));
		System.out.println(collect3);

	}

}

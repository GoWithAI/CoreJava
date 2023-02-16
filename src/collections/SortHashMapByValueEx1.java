package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValueEx1 {

	static HashMap<String, Integer> map;
	static ArrayList<Map.Entry<String, Integer>> arry;
	static LinkedHashMap<String, Integer> linkedMap;

	public static void main(String[] args) {
		map = new HashMap<>();
		arry = new ArrayList<>();
		linkedMap = new LinkedHashMap<>();

		map.put("a", 10);
		map.put("b", 30);
		map.put("c", 20);
		map.put("d", 5);
		map.put("e", 40);

		sort(map);
		sortGenericMethod(map);

	}

	private static void sort(HashMap<String, Integer> map) {

		// map entry (key-value pair)
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			arry.add(m);
		}

		Comparator<Map.Entry<String, Integer>> valueCoparator = new Comparator<>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				Integer value1 = o1.getValue();
				Integer value2 = o2.getValue();
				return value1.compareTo(value2);
			}
		};

		Comparator<Map.Entry<String, Integer>> valueCoparator2 = (i1, i2) -> i1.getKey().compareTo(i2.getKey());
		
		Collections.sort(arry, valueCoparator2); //can use valueCoparator

		for (Entry<String, Integer> entry : arry) {
			linkedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(linkedMap);
	}

	private static <K, V extends Comparable<? super V>> void sortGenericMethod(Map<K, V> unsortMap) {

		List<Map.Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(unsortMap.entrySet());

		//(x < y) ? -1 : ((x == y) ? 0 : 1);
		Comparator<Map.Entry<K, V>> valueCoparator = new Comparator<>() {
			@Override
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				V value1 = o1.getValue();
				V value2 = o2.getValue();
				return value1.compareTo(value2);
			}
		};

		Collections.sort(list, valueCoparator);
		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		System.out.println(result);
	}

}

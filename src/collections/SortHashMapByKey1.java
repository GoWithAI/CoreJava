package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SortHashMapByKey1 {

	static Comparator<Entry<String, Integer>> compareKey = (i1, i2) -> i1.getKey().compareTo(i2.getKey());
	
	static Supplier<LinkedHashMap<String, Integer>> mapSupplierForObjectInsertion = LinkedHashMap::new;
	
	static BinaryOperator<Integer> mergeFunction = (e1, e2) -> e1;// Pending ?
	
	static BiConsumer<String, Integer> display = (x, y) -> System.out.println(x + " " + y);
	
	// This map stores unsorted values
	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {

		map.put("Jayant", 80);
		map.put("Abhishek", 90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish", 40);

		// Calling the function to sortbyKey
		sortbykeyJava8Stream();
		System.out.println("**************");
		sortbykeyTreeMap();
		System.out.println("********sortbykeyJava8******");
		sortbykeyJava8();
	}

	private static void sortbykeyTreeMap() {

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		// naturally sorted by key in Below Both Cases
		// TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		treeMap.putAll(map);
		treeMap.forEach(display);
	}

	private static void sortbykeyJava8() {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

		// Sort the list using lambda expression
		Collections.sort(list, (i1, i2) -> i1.getKey().compareTo(i2.getKey()));	
		
		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		temp.forEach(display);
		
	}

	private static void sortbykeyJava8Stream() {

		LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(compareKey)
				.collect(Collectors.toMap(Map.Entry<String, Integer>::getKey, Map.Entry<String, Integer>::getValue,
						mergeFunction, mapSupplierForObjectInsertion));

		collect.forEach(display);

	}

}

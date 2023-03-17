package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx$ {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();

		// Key sorted
		map.put("a", "apple");
		map.put("e", "egg");
		map.put("g", "gear");

		System.out.println("Tree-Map :" + map);

		SortedMap<String, String> smap = map.subMap("a", "e");
		smap.put("b", "ball");
		//smap.put("f", "fish");

		System.out.println(map);
	}
}

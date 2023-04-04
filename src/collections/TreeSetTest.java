package collections;

import java.util.TreeMap;
import java.util.TreeSet;

// TreeSet - Duplicates not allowed replaced
// TreeSet sorts the data in natural/ ascending order that is inserted 

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<>();
		TreeMap<String, String> tMap = new TreeMap<String, String>();

		tSet.add("Deepak");
		tSet.add("is");
		tSet.add("Deepak");
		tSet.add("Hello");

		for (String s : tSet)
			System.out.println(s);
	}

}

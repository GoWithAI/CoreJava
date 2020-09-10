package collections.concurrency;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class UnModifiableMapEx {

	public static void main(String[] args) {

		Hashtable<String, String> table = new Hashtable<>();

		table.put("key1", "1");
		table.put("key2", "2");
		table.put("key3", "3");

		Map<String, String> unmodifiableMap = Collections.unmodifiableMap(table);
		System.out.println("unmodifiableMap" + unmodifiableMap);
		
		table.put("temp", "temp");
		System.out.println("table :"+table);
		
		//unmodifiableMap.put("key4", "4"); //UnsupportedOperationException
		
		System.out.println("*************HASHMAP************");
		Hashtable<String, String> table2 = new Hashtable<>();

		table2.put("key1", "1");
		table2.put("key2", "2");
		table2.put("key3", "3");

		Map<String, String> unmodifiableMap2 = Collections.unmodifiableMap(table2);
		System.out.println("unmodifiableMap2" + unmodifiableMap2);
		
		table2.put("temp", "temp");
		System.out.println("table2 :"+table2);
		
		unmodifiableMap.put("key4", "4");
		
	}

}

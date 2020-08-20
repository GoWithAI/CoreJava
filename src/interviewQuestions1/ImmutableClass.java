package interviewQuestions1;

import java.util.HashMap;
import java.util.Iterator;

/**
 * How to Create an immutable class in Java?
 * 
 * 1. Declare Class so final so it can't be extended 2. Make all fields private
 * so that direct access is not allowed 3. Don't provide setter method for
 * variable 4. Make all mutable fields final so that its value can be assigned
 * only once 5. Initialize all the fields via a Constructor performing deep
 * copy* 6. Perform cloning of objects in the getter methods to return a copy
 * rather than returning the actual object reference
 **/

public final class ImmutableClass {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;

	/***
	 * Perform Deep Copy
	 */
	public ImmutableClass(int i, String n, HashMap<String, String> hm) {
		System.out.println("Performing Deep Copy for Object Initialization");
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;

		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			key = iterator.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}

	public ImmutableClass(int i, String n, HashMap<String, String> hm, boolean showCopy) {
		System.out.println("Performing Shallow Copy for Object Initilization");
		this.id = i;
		this.name = n;
		this.testMap = hm;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

}

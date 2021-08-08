package collections;

import java.util.Arrays;
import java.util.HashSet;

// HashSet : (Internally stores values as Key IN HashMap)
// 1. order does not maintain
// 2. duplicate not allowed - override if added duplicate
// 3. only one Null allowed
// 4. Non Sychronized
// 5. iterator returned by this class is fail-fast


// Set allowed duplicate object  equals() and hashCode() methods 
public class HashSetDuplicateObject {

	public static void main(String[] args) {

		Emp emp = new Emp("Dipak", "Patil");
		Emp emp2 = new Emp("Dipak", "Patil");

		// HashSet internally Put value as key in HashMap & value will be Empty Object
		HashSet<Emp> hashSet = new HashSet<Emp>();

		hashSet.add(emp);
		hashSet.add(emp2);

		System.out.println(hashSet);

		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Dipak");
		hashSet2.add("Dipak");

		System.out.println(hashSet2);
		
	
	}

}

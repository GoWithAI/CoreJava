package collections;

import java.util.HashSet;

/*
    It stores unique elements and permits null
    It is backed by a HashMap
    It doesn’t maintain insertion order
    It is not thread-safe
    */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
          
        boolean b1 = hs.add("Geeks");
        boolean b2 = hs.add("GeeksforGeeks");
          
        boolean b3 = hs.add("Geeks");
          
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
          
        // printing all elements of hashset
        System.out.println(hs);

	}

}

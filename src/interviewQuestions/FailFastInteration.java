package interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 1. Whereas Fail-fast iterators throw an exception(ConcurrentModificationException) 
 * if the collection is modified while iterating over it.
 * 2. iterators traverse over the clone of the collection
 * */

public class FailFastInteration {

	public static void main(String[] args) {
		List<Integer> integers= new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		
		Iterator<Integer> itr= integers.iterator();
		
		while(itr.hasNext()) {
			Integer a = itr.next();
			//itr.remove(); // will not throw Exception
			integers.remove(1);  //.ConcurrentModificationException
			//integers.add(4); //.ConcurrentModificationException
			//itr.next(); //NoSuchElementException
		}
		
		while(itr.hasNext()) {
			Integer a = itr.next();
		System.out.println(a);
		}

	}

}

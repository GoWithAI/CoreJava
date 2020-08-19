package interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * 1. Fail-safe iterators means they will not throw any exception even 
 * if the collection is modified while iterating over it.
 * 
 * 2. In case of CopyOnWriteArrayList the original collections is passed and is stored in the iterator
 * 
 * */

public class FailSafeInteration {

	public static void main(String[] args) {
		
		List<Integer> integers= new CopyOnWriteArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
	
		Iterator<Integer> itr2 = integers.iterator();
		while (itr2.hasNext()) {
		    int a = itr2.next();
		    if (a == 1) {
		        integers.remove(Integer.valueOf(a));
		    }
		    System.out.println(a);
		} 
		// the iterator will print all the elements 1,2,3 
		//because it traverses over the snapshot of the collection elements
		System.out.println("***"+ integers); //collection now has only elements 2 and 3 
		
		
		System.out.println("*************Second Example**********");
		List<Integer> integers2= new CopyOnWriteArrayList<>();
		integers2.add(1);
		integers2.add(2);
		integers2.add(3);
		
		Iterator<Integer> itr5 = integers2.iterator();
		while(itr5.hasNext()) {
			Integer a = itr5.next();
			//integers2.remove(a);
			if(a==1) {
				itr5.remove();	
			}			
		}
		Iterator<Integer> itr6 = integers2.iterator();
		while(itr6.hasNext()) {
			Integer a = itr6.next();
			System.out.println(a);
		}
	}

}
/* Downsides of this iterator are:
1. They will not reflect the latest state of the collection.
2. It requires extra memory as it clones the collection.
*/
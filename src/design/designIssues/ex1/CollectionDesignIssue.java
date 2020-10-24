package design.designIssues.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDesignIssue {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(1); //Remove based on Index of list
		System.out.println(list);
		
		
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		collection.remove(1); // Remove based on Comparing object
		System.out.println(collection);
	}

}

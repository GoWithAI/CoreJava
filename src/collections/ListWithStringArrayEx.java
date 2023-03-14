package collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithStringArrayEx {

	public static void main(String[] args) {
		
		List<String> strs = new ArrayList<>();
		
		strs.add("A");
		strs.add("B");
		strs.add("C");

		String[] arr = new String[5];
		
		arr = strs.toArray(arr); //Copy List elements into arr object
		for(String s : arr) {
			System.out.println(" val :"+ s);
		}
		
	}

}

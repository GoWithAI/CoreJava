package amazingSurprise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLRemoveEle {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		List<String> list2 = new LinkedList<>();
		list2.add("a");
		list2.add("b");

		list.removeAll(list2);
		System.out.println(list);// remove list2 element from list

		Iterator<String> iterator = list2.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}

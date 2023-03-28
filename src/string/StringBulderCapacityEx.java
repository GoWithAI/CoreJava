package string;

import java.util.ArrayList;
import java.util.List;

public class StringBulderCapacityEx {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(10); // capacity 10
		StringBuilder sb2 = new StringBuilder("ABCDE");// capacity 4 + 16(default)
		System.out.println(sb.capacity() + "    " + sb2.capacity());

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.removeIf(p -> p > 12);
		System.out.println(l);

		List l2 = new ArrayList<>();
		l2.add(5);
		l2.add(5);

		/*
		 * int max = Integer.max(l2.get(0), 1); System.out.println(max);
		 */
		String s = String.join("-", "1", "2", "3");
		System.out.println(s);

		List list = new ArrayList<>(1);
		list.add(1);
		list.add("A");
		list.add(new Integer(5));
		System.out.println(list);
	}

}

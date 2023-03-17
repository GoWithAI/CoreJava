package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeququeEx {

	public static void main(String[] args) {
			Deque<String> dq = new ArrayDeque<>();
			dq.add("a");//add at end of deque
			dq.add("c");
			dq.add("d");
			dq.add("a");
			
			System.out.println(dq);

	}

}

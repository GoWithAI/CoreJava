package AllLatest2025.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeququeEx {

	public static void main(String[] args) {
			Deque<String> dq = new ArrayDeque<>();
			dq.add("a");//add at end of deque
			dq.add("c");
			dq.add("d");
			dq.add("e");
			System.out.println(dq);

            dq.addFirst("1");
            dq.addLast("2");
            System.out.println(dq);

            dq.removeFirst();
            dq.removeLast();
            System.out.println(dq);

            dq.pollFirst();
            dq.pollLast();
            System.out.println(dq);

            dq.getFirst();
            dq.getLast();
            System.out.println(dq);
	}
}

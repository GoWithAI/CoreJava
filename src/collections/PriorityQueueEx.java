package collections;

import java.util.PriorityQueue;

// ordered according to their natural ordering, or by a Comparator provided at queue construction time
// null not allowed
//not permit insertion of non-comparable objects -ClassCastException
//priority queue is unbounded BUT capacity grows automatically
// For Thread safty Use - hread-safe PriorityBlockingQueue
public class PriorityQueueEx {

	public static void main(String[] args) {
		java.util.PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(11);
		queue.add(10);
		queue.add(22);
		queue.add(5);
		queue.add(12);
		queue.add(2);
		
		while(queue.isEmpty() == false)
			System.out.println(queue.remove());
		
		System.out.println();
	}

}

package parallelStream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StatelessBehaviors {

	public static void main(String[] args) {

		//Pending
		Set<Integer> seen = Collections.synchronizedSet(new HashSet<>());
		Stream<Integer> map = seen.stream().parallel().map(e -> { if (seen.add(e)) return 0; else return e; });
		System.out.println(map);
	}

}

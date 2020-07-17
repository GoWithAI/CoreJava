package parallelStream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StatelessBehaviors {

	public static void main(String[] args) {

		//Pending
		Set<Integer> seen = Collections.synchronizedSet(new HashSet<>());
		seen.stream().parallel().map(e -> { if (seen.add(e)) return 0; else return e; });

	}

}

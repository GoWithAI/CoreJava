package streams.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RemoveDuplicate {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		
		List<String> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		Set<String> unique2 = list.stream().collect(Collectors.toSet());
		System.out.println(unique2);
		
		
		ArrayList<Integer> numbersList
		= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		
		
		Map<Object, Long> map = numbersList.stream().collect(Collectors.toMap(t -> t, v -> 1L, Long::sum));
		
		System.out.println(map);
	}

}

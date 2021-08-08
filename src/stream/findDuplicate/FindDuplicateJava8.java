package stream.findDuplicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateJava8 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4, 4, 3, 3);

		 int frequency = Collections.frequency(numbers, 2); 
		 
		 System.out.println(frequency);
		 
		
		List<Integer> collect = numbers.stream().filter(s -> Collections.frequency(numbers, s) > 1)
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}

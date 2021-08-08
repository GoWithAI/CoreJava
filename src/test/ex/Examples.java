package test.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;

public class Examples {
	
	static Function<Integer, Integer> sqr = (i) ->{
		 return i * i;
	};

	static Predicate<Integer> valueGreaterThan = i -> i > 100;
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10, 8, 9, 12, 19, 18);

		int sum = asList.stream().map(sqr).filter(valueGreaterThan).mapToInt(Integer::valueOf).sum();
		
		 OptionalDouble average = asList.stream().map(sqr).filter(valueGreaterThan).mapToInt(Integer::valueOf).average();
		
		System.out.println(sum);
		System.out.println(average);
		
	}

}

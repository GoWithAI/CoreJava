package test.ex;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;

public class AdditionAndAverage {
	
	static Function<Integer, Integer> sqr = (i) ->{
		 return i * i;
	};

	static Predicate<Integer> valueGreaterThan = i -> i > 100;
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10, 8, 9, 12, 19, 18);

		int sum = additionBySquaringWithCondition(asList);
		
		 OptionalDouble average = averageBySquaringWithCondition(asList);
		
		System.out.println(sum);
		System.out.println(average);
		
	}

	private static OptionalDouble averageBySquaringWithCondition(List<Integer> asList) {
		return asList.stream().map(sqr).filter(valueGreaterThan).mapToInt(Integer::valueOf).average();
	}

	private static int additionBySquaringWithCondition(List<Integer> asList) {
		return asList.stream().map(sqr).filter(valueGreaterThan).mapToInt(Integer::valueOf).sum();
	}

}

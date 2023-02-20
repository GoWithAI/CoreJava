package test.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8FilterDigitStartWith {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(-23, 49, 55, 220, 223, 414, 24, 45, 20);
		// -23
		Function<Integer, String> convertToString = i -> String.valueOf(i);
		Predicate<String> pred = s -> s.startsWith("2") || s.startsWith("-2");
		List<String> result = list.stream().map(convertToString).filter(pred).collect(Collectors.toList());
		
		System.out.println(result);

	}

}

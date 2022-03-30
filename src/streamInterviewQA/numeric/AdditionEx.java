package streamInterviewQA.numeric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class AdditionEx {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 5, 4, 20);

		asList.stream().mapToInt(Integer::intValue).sum();

		asList.stream().mapToInt(i -> i).reduce(0, (x, y) -> x + y);

		asList.stream().collect(Collectors.summingInt(Integer::intValue));

		asList.stream().reduce(0, (x, y) -> x + y);

		asList.stream().reduce(0, Integer::sum);

	}

	// Alternate to this below
	public Integer ex(Integer identity) {
		Integer result = identity;
		List<Integer> stream = new ArrayList<>();

		BinaryOperator<Integer> accumulator = (x, y) -> x + y;

		for (Integer element : stream)
			result = accumulator.apply(result, element);
		return result;
	}

}

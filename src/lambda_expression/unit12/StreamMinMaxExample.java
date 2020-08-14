package lambda_expression.unit12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	private static int findMaxValue(List<Integer> intList) {

		// x - 0,y-6
		// 1:x=6, y=7
		// 2:x=7, y=10
		// 3:x=10,y=9
		// 4:x=10, y=8
		// 5:x=10 = Max value

		return intList.stream().reduce(0, (x, y) -> x > y ? x : y);

	}

	private static Optional<Integer> findMaxValueOptinal(List<Integer> intList) {

		// x-6
		// 1:x=6, y=7
		// 2:x=7, y=10
		// 3:x=10,y=9
		// 4:x=10, y=8
		// 5:x=10 = Max value

		return intList.stream().reduce((x, y) -> x > y ? x : y);

	}

	private static Optional<Integer> findMinValueOptinal(List<Integer> intList) {

		// x - 0,y-6
		// 1:x=6, y=7
		// 2:x=7, y=10
		// 3:x=10,y=9
		// 4:x=10, y=8
		// 5:x=10 = Max value

		return intList.stream().reduce((x, y) -> x < y ? x : y);

	}

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(6, 7, 10, 9, 8);
		int maxValue = findMaxValue(intList);
		System.out.println(maxValue);

		List<Integer> intListOptional = new ArrayList<Integer>();
		Optional<Integer> findMaxValueOptinal = findMaxValueOptinal(intListOptional);
		if (findMaxValueOptinal.isPresent())
			System.out.println("Max value :" + findMaxValueOptinal.get());
		else
			System.out.println("No Value Present");

		Optional<Integer> findMinValueOptinal = findMinValueOptinal(intList);
		if (findMinValueOptinal.isPresent())
			System.out.println("Min value :" + findMinValueOptinal.get());
		else
			System.out.println("No Value Present");

	}

}

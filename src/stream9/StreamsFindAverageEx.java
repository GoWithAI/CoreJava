package stream9;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamsFindAverageEx {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		OptionalDouble average = intList.stream().filter(p -> (p > 5)).mapToInt(i -> i * i).average();
		average.ifPresent(c -> {
			System.out.println(c);
		});
	}
}

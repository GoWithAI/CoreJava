package streamInterviewQA.numeric;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AverageMinMaxByUsingStream {

	static Comparator<Integer> sortComp = (i, j) -> {
		return (i < j) ? -1 : 1;
	};

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 5, 4, 20);

		min(asList);
		max(asList);
		avg(asList);
	}

	public static void min(List<Integer> asList) {

		Optional<Integer> max = asList.stream().max(sortComp);
		System.out.println("min = " + max.get());

		OptionalInt max2 = asList.stream().mapToInt(m -> m).max();
		System.out.println("min = " + max2.getAsInt());
	}

	public static void max(List<Integer> asList) {

		Optional<Integer> max = asList.stream().min(sortComp);
		System.out.println("max = " + max.get());

		OptionalInt min = asList.stream().mapToInt(m -> m).min();
		System.out.println("max = " + min.getAsInt());
	}

	public static void avg(List<Integer> asList) {
		OptionalDouble average = asList.stream().mapToInt(m -> m).average();
		System.out.println("average :" + average.getAsDouble());
	}

}

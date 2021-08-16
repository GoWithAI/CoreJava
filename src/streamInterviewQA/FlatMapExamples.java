package streamInterviewQA;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/***
 * It’s challenging to process a Stream containing more than one level, like
 * Stream<String[]> or Stream<List<LineItem>> or Stream<Stream<String>>. And we
 * flat the 2 levels Stream into one level, like Stream<String> or
 * Stream<LineItem>, so that we can easily loop the Stream and process it.
 **/
public class FlatMapExamples {

	static Predicate<String[]> filterNotA = (p) -> {

		for (String s : p) {
			if (s.equals("a"))
				return false;
		}

		return true;
	};

	public static void flatMapExample(String[][] array) {

		List<String> collect = Stream.of(array) // Stream<String[]>
				.flatMap(Stream::of) // Stream<String>
				.filter(x -> !"a".equals(x)) // filter out the a
				.collect(Collectors.toList()); // return a List

		collect.forEach(System.out::println);
	}

	public static void main(String[] args) {
		String[][] array = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// array to a stream
		Stream<String[]> stream1 = Arrays.stream(array);
		List<String[]> result = stream1.filter(filterNotA).collect(Collectors.toList());
		result.forEach(x -> System.out.println(Arrays.toString(x)));

		flatMapExample(array);
		
	}

}

package streamInterviewQA;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsOutPut {

	public static void main(String[] args) {
		streamBasicOperation();

		Consumer<String> strC = s ->		System.out.println(s);

	}

	private static void streamBasicOperation() {
		Stream<String> stream = Stream.of("123", "234", "345");
		BiFunction<String, String, String> fun = (String s1, String s2) -> "Hello";
		Stream<String> strm = stream.map((String s) -> s.substring(0, 1));
		strm.forEach(System.out::print);
	}

	private static void streamBasicOperation2() {
		Stream<String> stream = Stream.of("123", "234", "345");
		BiFunction<String, String, String> fun = (String s1, String s2) -> "Hello";
		Stream<String> strm = stream.map((String s) -> s.substring(0, 1));
		strm.forEach(System.out::print);
	}

}

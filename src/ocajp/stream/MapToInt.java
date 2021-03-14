package ocajp.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToInt {

	public static void main(String[] args) {

		Stream<Double> stream = Stream.of(2.2,2.8,2.5);
		
		IntStream out = stream.mapToInt(Double::intValue);
	}

}

package stream9;

import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx1 {

	public static void main(String[] args) {

		IntStream of = IntStream.of(1, 2, 2, 4);

		Function<Integer, String> fun = f -> {
			Integer.toString(0);// static
			Integer intI = new Integer(10);
			intI.toString();// Object call
			return "";
		};

		//Stream<String> st = of.boxed().map(Integer::toString);// Compile TIme - both toString() and toString(int) from the type Integer are eligible
		OptionalInt findFirst = of.distinct().findFirst();
		System.out.println(findFirst.getAsInt());
	}

}

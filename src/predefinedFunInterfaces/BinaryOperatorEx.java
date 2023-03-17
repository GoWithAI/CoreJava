package predefinedFunInterfaces;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class BinaryOperatorEx {
	public static void main(String[] args) {
		IntStream range = IntStream.range(1, 4); // nice amount of predefined methods
		IntConsumer cons = System.out::print;
		cons.accept(range.sum());
	}
}

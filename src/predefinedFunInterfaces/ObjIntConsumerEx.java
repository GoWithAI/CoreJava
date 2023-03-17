package predefinedFunInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class ObjIntConsumerEx {
	public static void main(String[] args) {
		// objIntConsumerEx();
		// toIntFunctionEx();

		removeIfSample();
	}

	private static void removeIfSample() {
		List<Integer> arr = new ArrayList<>();
		// Arrays.asList(9, 2, 5, 7, 4); // do not have remove() method - return type of
		// asList is Arrays&ArrayList not java.util.ArrayList
		arr.add(9);
		arr.add(2);
		arr.add(5);
		arr.add(7);
		arr.add(4);

		Predicate<Integer> pred1 = p -> (p > 2);
		Predicate<Integer> pred2 = pred1.and(p -> (p < 4));

		System.out.println(arr.removeIf(pred2));

		for (Integer integer : arr) { // Concurrent Modification - fail fast
			arr.remove(0);
		}

	}

	private static void objIntConsumerEx() {
		List<Integer> arr = Arrays.asList(3, 2, 5, 7, 4);
		ObjIntConsumer<List<Integer>> func = (ar, n) -> {
			ar.stream().forEach(x -> System.out.print(x + 1 + "  "));
		};
		func.accept(arr, 2);

		System.out.println();
	}

	private static void toIntFunctionEx() {
		Stream<Double> listStr = Stream.of(10.0, 20.3, 30.4);
		ToIntFunction<Double> fun = d -> d.intValue();

		Stream<Integer> boxed = listStr.mapToInt(fun).boxed();

		boxed.forEach(System.out::print);
		System.out.println();
	}

}

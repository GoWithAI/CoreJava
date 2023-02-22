package ocajp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatteningOperationEx {

	public static void main(String[] args) {
		flattenList();
		flatMapUnFlatten();
	}

	private static void flatMapUnFlatten() {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(4, 5);
		
		Function<Integer, Stream<List<Integer>>>  fun = i -> numbers2.stream().map(j -> Arrays.asList(i, j));
		List<List<Integer>> collect = numbers1.stream().flatMap(fun).collect(Collectors.toList());
		// [[1, 4], [1, 5], [2, 4], [2, 5], [3, 4], [3, 5]]
		System.out.println(collect);
	}

	private static void flattenList() {
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		List<Integer> numberList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(numberList);
	}

}

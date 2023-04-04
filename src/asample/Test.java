package asample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
	// 222 , 102, 201, 321, 900, 2000 -> 222 102 201 321 2000
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(222 , 102, 201, 321, 900, 2000);
		Function<Integer, String> fun = f ->{
			return f.toString();
		};
		
		List<String> collect = asList.stream().map(fun).filter(p -> p.contains("2")).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}

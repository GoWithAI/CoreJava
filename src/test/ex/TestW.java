package test.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestW {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,6,4,9,12,22,14,15,18,31,35,49,76,58,79,00);
		
	Function<Integer, String> fun = f ->f.toString();
		
	List<String> collect = asList.stream().filter(p -> (p % 2 ==  0))
		.map(fun).filter( p -> p.startsWith("1") || p.startsWith("2") ).collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	}

}

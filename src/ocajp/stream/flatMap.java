package ocajp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMap {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("123","234","345");
		Stream<String> out = stream.map((String s)-> s.substring(0, 1));
		
		out.forEach(System.out::print);
		System.out.println("************************");
		
		List<String> asList = Arrays.asList("1Z0-809","1Z0-810","1Z1-811","1Z0-803");
		
		Function<String,Stream<String>> strem = (e) -> Stream.of(e.split("-"));
		
		Stream<String> flatMap = asList.stream().flatMap(strem);
		/* 
		 * 1Z0 809 1Z0 810 1Z0 811 1Z0 803
		 */
		Stream<String> distinct = flatMap.distinct();
		/*
		 * 1Z0 809 810 811 803
		 */
		Stream<String> sorted = distinct.sorted();
		/*
		 * 1Z0 803 809 810 811
		 */
		List<String> collect = sorted.collect(Collectors.toList());
		collect.forEach(System.out::println);
		/*
		 * 1Z0 803 809 810 811
		 */
	}
}

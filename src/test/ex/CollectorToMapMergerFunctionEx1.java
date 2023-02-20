package test.ex;

import java.util.HashMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToMapMergerFunctionEx1 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("apple", "banana", "cherry", "apple", "cherry");

		BinaryOperator<Integer> mergerFun =  Integer:: sum;
		
		HashMap<String, Integer> collect = stream.collect(Collectors.toMap( s -> s, s -> 1, mergerFun, HashMap::new));
		System.out.println(collect);
	}

}

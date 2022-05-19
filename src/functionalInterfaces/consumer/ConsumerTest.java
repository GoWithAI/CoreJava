package functionalInterfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// you can use it to create a method forEach, which takes a list of Integers and applies an operation on each
//element of that list
public class ConsumerTest {

	static List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

	static Consumer<List<String>> toUpperCase = (list) -> {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
	};
	
	static Consumer<List<String>> computerPrice = (list) -> {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
	};

	static Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);
	
	public static void main(String[] args) {
		
		
		toUpperCase.andThen(printConsumer).accept(cities);
	}

}

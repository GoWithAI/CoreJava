package lambda_expression.unit9.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsVsCollections {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("adam");
		names.add("jim");
		names.add("jenny");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		// NOTE
		// Stream can be traversed Only Once
		System.out.println("*************************");
		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		
	}

}

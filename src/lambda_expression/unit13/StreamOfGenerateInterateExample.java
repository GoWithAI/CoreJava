package lambda_expression.unit13;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateInterateExample {

	public static void main(String[] args) {

		Stream<String> stringStream=Stream.of("Deep", "Patil","CSE");
		stringStream.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2)
		.limit(10)
		.forEach(System.out::println);
		
		Supplier<Integer> intergerSupplier=new Random()::nextInt;
		
		Stream.generate(intergerSupplier).limit(5).forEach(System.out::println);
	}

}

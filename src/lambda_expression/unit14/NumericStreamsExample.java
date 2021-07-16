package lambda_expression.unit14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int subOfNumbers(List<Integer> intergerList) {
		return intergerList.stream().reduce(0, (x,y) -> x+y);
	}
	
	public static int sumOfNumbersIntStream() {
		return IntStream.rangeClosed(1, 7)
				//1
				//2
				//3
				//4
				//5
				//6
				.sum();
	}
	
	//count of elements in this stream
	public static long countOfNumbersIntStreamRang() {
		return IntStream.range(1, 7).count();
	}
	
	public static void main(String[] args) {
		

		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println("Sum of N numbers :" + subOfNumbers(asList));
		System.out.println(sumOfNumbersIntStream());
		
		System.out.println(countOfNumbersIntStreamRang());
		
		System.out.println("RANGE Operation :");
		IntStream.range(1, 7).forEach((value-> System.out.print(value + ",")));
		long rangCount = IntStream.range(1, 50).count();
		System.out.println("rangeCount :"+rangCount);
		
		System.out.println();
		System.out.println("RANGE CLOSED Operation :");
		IntStream.rangeClosed(1, 7).forEach((value-> System.out.print(value + ",")));
		long rangCountClose = IntStream.rangeClosed(1, 50).count();
		System.out.println("rangCountClose :"+rangCountClose);
		
		
		System.out.println("Int to Double ");
		IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value +","));

	}

}

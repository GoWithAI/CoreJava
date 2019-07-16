package imperativeVsDeclarative;

import java.util.stream.IntStream;

public class Example1 {

	public static void main(String[] args) {

		/*
		 * Imperative Programming - HOW style
		 * 
		 */
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum Using Imperative Programming :" + sum);

		/*
		 * Declarative Programming - WHAT style
		 *
		 */

		int sum2 = IntStream.rangeClosed(0, 100).parallel().sum();

		System.out.println("Sum Using Declarative Programming :" + sum2);

	}

}

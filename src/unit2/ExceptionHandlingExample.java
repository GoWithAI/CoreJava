package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String args[]) {
		int[] someNumber = { 1, 2, 3, 4, 5 };
		int key = 0;

		process(someNumber, key, (v, k) -> {
			try {
				System.out.println(v / k);
			} catch (ArithmeticException a) {
				System.out.println("Arithmatic exception");
			}
		});
	}

	private static void process(int[] someNumber, int k, BiConsumer<Integer, Integer> consume) {
		for (int v : someNumber) {
			consume.accept(v, k);
		}

	}

}

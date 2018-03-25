/**
 * 
 */
package unit2;

import java.util.function.BiConsumer;

/**
 * @author Soft
 *
 */
public class ExceptionHandling2 {
	public static void main(String args[]) {
		int[] someNumber = { 1, 2, 3, 4 };
		int key = 0;

		process(someNumber, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] someNumber, int k, BiConsumer<Integer, Integer> consume) {
		for (int v : someNumber) {
			consume.accept(v, k);
		}

	}

	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consume) {
		return (v, k) -> {
			try{
			consume.accept(v, k);
			}catch(ArithmeticException e){
				System.out.println("Arithmatic Exception="+v);
			}
		};
	}
}

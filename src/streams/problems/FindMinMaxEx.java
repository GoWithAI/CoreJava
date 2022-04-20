package streams.problems;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinMaxEx {

	public static void main(String[] args) {
		int[] items = { 10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55 };

		
		OptionalInt maxVal = Arrays.stream(items).max();
		System.out.println(maxVal);
		
		OptionalInt minVal = Arrays.stream(items).min();
		System.out.println(minVal);
	}

}

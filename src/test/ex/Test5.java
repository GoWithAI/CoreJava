package test.ex;

import java.util.Arrays;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,4,3,8,5,6,9);
		
		int sum = intList.stream().filter( p ->  (p % 2 != 0)).mapToInt( m -> m).sum();
		System.out.println(sum);
	}

}

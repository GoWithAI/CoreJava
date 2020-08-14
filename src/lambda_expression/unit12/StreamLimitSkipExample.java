package lambda_expression.unit12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	private static Optional<Integer> limit(List<Integer> intList) {
		return intList.stream()
				.limit(3)
				.reduce((x, y) -> x+y);
	}
	
	private static Optional<Integer> skip(List<Integer> intList) {
		return intList.stream()
				.skip(3)
				.reduce((x, y) -> x+y);
	}
	
	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(6, 7, 10, 9, 8);
		
		Optional<Integer> limitOptinal = limit(intList);
		if(limitOptinal.isPresent()) 
			System.out.println("limit "+limitOptinal.get());
		else
			System.out.println("not present");
		
		Optional<Integer> skipOptinal = skip(intList);
		if(skipOptinal.isPresent()) 
			System.out.println("skip "+skipOptinal.get());
		else
			System.out.println("not present");
	}

}

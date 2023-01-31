package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * var instroduced for Lambada parameter  in Java 11 
why ? 
*/

public class LocalVariableInLambda {

	private static void varLambdaParameter() {
		List<String> list = Arrays.asList("a", "b", "c");
		String result = list.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
	}

// why ? 
	// @NonNull is either used by a validation framework
	private static void varLambdaParameterWhy() {
		List<String> list = Arrays.asList("a", "b", "c", null);
		// NOW WE CAN ADD ANNOTATION ALSO eg. @NotNull
		String result = list.stream().map((@NotNull var x) -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
	}

	public static void main(String[] args) {
		varLambdaParameter();
		varLambdaParameterWhy();
	}

}

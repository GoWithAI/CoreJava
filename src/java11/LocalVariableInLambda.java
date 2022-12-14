package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class LocalVariableInLambda {

	public static void main(String[] args) {

		varLambdaParameter();
		varLambdaParameterWhy();
	}

	private static void varLambdaParameterWhy() {
		List<String> list = Arrays.asList("a", "b", "c");
		//NOW WE CAN ADD ANNOTATION ALSO eg. @NotNull
		//String result = list.stream().map((@NotNull var x) -> x.toUpperCase()).collect(Collectors.joining(","));
	}

	private static void varLambdaParameter() {
		List<String> list = Arrays.asList("a", "b", "c");
		String result = list.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
	}

}

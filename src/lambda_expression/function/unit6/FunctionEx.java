package lambda_expression.function.unit6;

import java.util.function.Function;

public class FunctionEx {

	static Function<String, String> toUpperCase=(s)-> s.toUpperCase();
	
	static Function<String, String> toUpperCaseAppend=(s)-> s.toUpperCase().concat("default");
	
	
	public static void main(String[] args) {

	String apply = toUpperCase.apply("java8");		
	System.out.println(apply);
	
	String apply2 = toUpperCaseAppend.apply("java8");
	System.out.println(apply2);
	
	String apply3 = toUpperCase.andThen(toUpperCaseAppend).apply("java8");
	System.out.println(apply3);
	
	String apply4 = toUpperCase.compose(toUpperCaseAppend).apply("java8");
	System.out.println(apply4);
	}

}

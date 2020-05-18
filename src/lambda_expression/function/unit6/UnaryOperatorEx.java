package lambda_expression.function.unit6;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

	static UnaryOperator<String> unaryOperator = s-> s.concat("Default");
	
	public static void main(String[] args) {

		String result = unaryOperator.apply("java8");
		System.out.println(result);
	}

}

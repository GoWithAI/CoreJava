package lambda_expression.unit1;

public class TypeInferenceExample {

	public static void main(String[] args) {
	
		StringLengthLambda sl=s -> s.length();
		System.out.println(sl.getStringLen("Hello"));

	}
	
	interface StringLengthLambda{
		int getStringLen(String s);
	}

}

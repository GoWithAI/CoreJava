package lambda_expression;

public class TypeInferenceExample2 {

	public static void main(String[] args) {
		printLambda(s->s.length());
	}

	public static void printLambda(StringLengthLambda s){
		System.out.println(s.getLength("Hello Test"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
}

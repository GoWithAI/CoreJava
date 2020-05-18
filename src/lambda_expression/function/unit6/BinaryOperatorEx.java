package lambda_expression.function.unit6;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

	public static void main(String[] args) {

		Comparator<Integer> comparator= (a,b) -> a.compareTo(b);
		
		BinaryOperator<Integer> mul= (m,n) -> m*n;
		
		Integer result = mul.apply(5, 4);
		System.out.println(result);
		
		
		BinaryOperator<Integer> minByOper=BinaryOperator.minBy(comparator);
		Integer minBy = minByOper.apply(4, 5);
		System.out.println("minBy :"+minBy);
		
		
		BinaryOperator<Integer> maxByOper=BinaryOperator.maxBy(comparator);
		Integer maxBy = maxByOper.apply(4, 5);
		System.out.println("maxBy :"+maxBy);
	}

}

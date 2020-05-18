package lambda_expression.predicate.unit6;

import java.util.function.Predicate;

public class PredicateEx {

	static Predicate<Integer> p3 = (p) -> {
		return p % 10 == 0;
	};
	static Predicate<Integer> p1 = (p) -> p % 10 == 0;
	static Predicate<Integer> p2 = (p) -> p % 8 == 0;

	public static void andPredicate() {
		boolean testAnd = p1.and(p2).test(10);
		System.out.println(testAnd);
	}

	public static void orPredicate() {
		boolean testOr = p1.or(p2).test(10);
		System.out.println(testOr);
	}

	public static void negationPredicate() {

		boolean testNegate = p1.or(p2).negate().test(10);
		System.out.println(testNegate);
	}

	public static void main(String[] args) {

		boolean test = p1.test(10);
		boolean test2 = p2.test(10);
		System.out.println(test + "   :  " + test2);
		andPredicate();
		orPredicate();
		negationPredicate();
	}

}

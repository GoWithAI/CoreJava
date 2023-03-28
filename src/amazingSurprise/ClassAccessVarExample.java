package amazingSurprise;

import java.util.function.Predicate;

public class ClassAccessVarExample {
	int id;
	static int id2;

	private void m1() {
		System.out.println(id2);
		m2();
	}

	private static void m2() {
		// m1();
		// System.out.println(id);
	}

	public static void main(String[] args) {
		ClassAccessVarExample e = new ClassAccessVarExample();
		e.id = 3;
		// System.out.println(id);
		// In lambda - we area able to access non static variable p.id in this static
		// method
		Predicate<ClassAccessVarExample> pred = p -> (p.id < 10);// p.id
		check(e, p -> p.id < 10);// p.id
	}

	private static void check(ClassAccessVarExample e, Predicate<ClassAccessVarExample> pr) {
		String res = pr.test(e) ? "match" : "not match";
		System.out.println(res);
	}
}

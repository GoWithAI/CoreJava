package interviewQuestions2.domain;

public class TestInstanceOfEx {

	public static void main(String[] args) {

		Printable p = new B();

		Call c = new Call();
		c.invoke(p);

		X x = new X();
		if (x instanceof X) {
			System.out.println("It Self Instance");
		}

	}

}

package interviewQuestions.inheritance;

class Person {
	public Person(String s) {
		super();
	}
}

class Emp extends Person {
	public Emp() {
		this("Kent");
	}

	public Emp(String s) {
		super(null);
		System.out.println(s);
	}
}

public class SuperMethodEx {
	public static void main(String[] args) {
		Person p = new Emp();
	}
}

package encapsulation.classLevelPrivate;

public class Person {

	private int age; //Def: Private Scope is Class Level not Object

	public Person(int age) {
		this.age = age;
	}

	public void play(Person p) {
		System.out.println("i am " + age + " years old");
		System.out.println("and i am playing with " + p.age + " old friend"); // Class scope in Java/C++/C# but in Scala
																				// have 2 option by using [this] feature
																				// we can make priavte at class or
																				// object
	}

}

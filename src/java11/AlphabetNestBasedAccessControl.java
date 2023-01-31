package java11;


/*
 * In this case compiler generate two classes, Alphabet and Alphabet$A.
In Java 11, The Java compiler will not generate any bridge method access$000 for private access within nest members. 
This new JVM access rule, Nest-Based Access Control allowed private access within nest members.
*/
public class AlphabetNestBasedAccessControl {
	private String name = "I'm Alphabet!";

	public class A {
		public void printName() {
			System.out.println(name);
		}
	}
}

package design.designPattern.ImmutableClass;

/**
 * instances of their classes never change after construction
 * 
 * Immutable objects are particularly useful in concurrent applications. Since
 * they cannot change state, they cannot be corrupted by thread interference or
 * observed in an inconsistent state.
 * 
 * An immutable class is good for caching purposes because you don't have to
 * worry about the value changes.
 * 
 * Note : inconsistency is only possible for mutable objects in multithreaded
 * case — it will not be an issue for the immutable version
 */

public class Test {

	public static void main(String[] args) {

		Emp emp = new Emp(1, "bumb");

		ImmutableRGB immutableRGB = new ImmutableRGB(1, 2, 3, "rgb", emp);
		System.out.println(immutableRGB);
		Emp emp2 = immutableRGB.getEmpRef();// Immutability broken
		emp2.setName("bumboooo");
		System.out.println(immutableRGB);
	}

}

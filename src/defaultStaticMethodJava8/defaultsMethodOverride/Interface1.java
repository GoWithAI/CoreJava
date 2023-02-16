package defaultStaticMethodJava8.defaultsMethodOverride;

/*
Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes
default methods were introduced to provide backward compatibility so that existing interfaces can use the lambda expressions without implementing the methods in the implementation class


*/
//default interface methods are abstract 
// Instance varible are static final
public interface Interface1 {

	default void test() {
		System.out.println("Interface1-test");
	}

	// Overload Default method
	default void test(String str) {
		System.out.println("Interface1-test: " + str);
	}

	// Overload Default method by non default not allowed - Not allowed
	// Not allowed to define method
	/*
	public void test(String str,String str2) {
			System.out.println("Interface1-test");
	}
	 */	
	default void test2() {
		System.out.println("Interface1-test2");
	}
	
	static void testStatic() {
		System.out.println("Interface1-Static method");
	}
}

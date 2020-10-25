package defaultStaticMethodJava8.defaultsMethodOverride;

public class TestClass implements Interface1 {

	//we can Override default method by Instance method, Or by abstract method in abstract class 
	@Override
	public void test() {
		System.out.println("TestClass-Test");
	}
	
	//same static method exist in super type but this we can not call overriden
	// static method are belongs to class
	static void testStatic() {
		System.out.println("TestClass-Static method");
	}

	// default method not allowed other than interface
	// default void test() {System.out.println("Interface1-test");}

}

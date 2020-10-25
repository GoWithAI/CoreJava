package defaultStaticMethodJava8.defaultsMethodOverride;

public class MainTest {

	public static void main(String[] args) {

		Interface1 i = new TestClass();
		i.test(); // First try to call overridden method in TestClass else will call Interface
					// Default method

		// Overridden method in class gets invoked
		i.test("Deep");

		// static method in interface only access by InterfaceName.staticMethodName
		//i.testStatic();

		TestClass.testStatic();
		Interface1.testStatic();

		// AbClass abClass = new AbClass();
		
		TestClass tc = new TestClass2();
		tc.testStatic();
		
		TestClass2 tc2 = new TestClass2();
		tc2.testStatic();
		
	}
}

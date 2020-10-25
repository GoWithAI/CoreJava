package defaultStaticMethodJava8.defaultsMethodOverride;

public class MainTest {

	public static void main(String[] args) {

		Interface1 i = new TestClass();
		i.test(); // First try to call overridden method in TestClass else will call Interface
					// Default method

		i.test("Deep");
		
		
		//AbClass abClass = new AbClass();
	}
}

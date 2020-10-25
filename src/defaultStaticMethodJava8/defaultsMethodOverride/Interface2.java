package defaultStaticMethodJava8.defaultsMethodOverride;

public interface Interface2 {

	 static String s ="e";
	
	default void test() {
		System.out.println("Interface2");
	}

}

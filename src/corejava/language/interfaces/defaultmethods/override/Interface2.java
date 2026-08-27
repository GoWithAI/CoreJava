package corejava.language.interfaces.defaultmethods.override;

public interface Interface2 {

	 static String s ="e";
	
	default void test() {
		System.out.println("Interface2");
	}

}

package defaultMethodJava8;

public interface Interface1 {

	default void test() {
		System.out.println("Interface1");
	}
}

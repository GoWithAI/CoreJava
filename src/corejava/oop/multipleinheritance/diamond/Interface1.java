package corejava.oop.multipleinheritance.diamond;

public interface Interface1 {

	default void methodA() {
		System.out.println("methodA : " + Interface1.class);
	}

}

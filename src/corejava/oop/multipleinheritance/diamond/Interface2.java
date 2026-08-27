package corejava.oop.multipleinheritance.diamond;

public interface Interface2 extends Interface1 {

	default void methodB() {
		System.out.println("methodB");
	}

	default void methodA() {
		System.out.println("methodA : " + Interface2.class);
	}

}

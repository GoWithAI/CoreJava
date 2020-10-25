package design.multipleInheritance2;

public interface Interface2 extends Interface1 {

	default void methodB() {
		System.out.println("methodB");
	}

	default void methodA() {
		System.out.println("methodA : " + Interface2.class);
	}

}

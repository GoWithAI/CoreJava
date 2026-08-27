package corejava.oop.multipleinheritance.conflict;

public interface Interface1 {
	
	default void methodA() {
		System.out.println("Interface1-methodA");
	}

}

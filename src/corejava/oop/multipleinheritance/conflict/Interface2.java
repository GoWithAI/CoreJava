package corejava.oop.multipleinheritance.conflict;

public interface Interface2 {
	
	default void methodA() {
		System.out.println("Interface2-methodA");
	}

}

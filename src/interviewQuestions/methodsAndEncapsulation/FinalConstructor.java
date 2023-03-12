package interviewQuestions.methodsAndEncapsulation;

class Supr {
	Supr(int i, int j) {

	}
}

public class FinalConstructor extends Supr {

	public FinalConstructor() {
		super(0, 0);
	}

	// we can not override constructor - compiler treat it as method
	// public Supr(int i , int j){ }

	// final illegal here due to no need at constructor level - no constructor
	// overriding , ? - cannot override constructors
	// final FinalConstructor() {}
	
	// constructor can not be overridden, compile time -error
	// if constructor made static then - its class level which leads to Breaking
	// inheritance, polymorphism basic principle - so language designer not allowed
	//public final static FinalConstructor() {}

	// synchronized not allowed at constructor level due to - JVM ensures that only
	// one thread can invoke a constructor call at a given point in time
	// public synchronized FinalConstructor() {} - Write down threads and Test ???

	public static void main(String[] args) {
		new FinalConstructor();
	}
}

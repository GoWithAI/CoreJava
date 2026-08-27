package corejava.language.statics;

public class StaticVariableExample {

	static int i; // Static Variable Shared Among Object - For each object same variable will be
					// shared
	static {
		i = 10;
	}
	int j;

	public StaticVariableExample() {
	}

	public StaticVariableExample(int j) {
		j = j; // this variable set has not effect ?
	}

	public static void main(String[] args) {

		StaticVariableExample t1 = new StaticVariableExample();
		System.out.println(t1.i);
		t1.i = 50;
		StaticVariableExample t2 = new StaticVariableExample();
		t2.i = 75;
		System.out.println(t1.i + "  " + t2.i);
		StaticVariableExample t3 = new StaticVariableExample(5);
		System.out.println(t3.j);
	}

}

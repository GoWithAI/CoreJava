package test.ex;

public class StaticVaribleEx {

	static int i; // Static Variable Shared Among Object - For each object same variable will be
					// shared
	static {
		i = 10;
	}
	int j;

	public StaticVaribleEx() {
	}

	public StaticVaribleEx(int j) {
		j = j; // this variable set has not effect ?
	}

	public static void main(String[] args) {

		StaticVaribleEx t1 = new StaticVaribleEx();
		System.out.println(t1.i);
		t1.i = 50;
		StaticVaribleEx t2 = new StaticVaribleEx();
		t2.i = 75;
		System.out.println(t1.i + "  " + t2.i);
		StaticVaribleEx t3 = new StaticVaribleEx(5);
		System.out.println(t3.j);
	}

}

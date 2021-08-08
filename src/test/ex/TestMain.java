package test.ex;

public class TestMain {

	static int i;

	static {
		i = 10;
	}

	int j;

	public TestMain() {
		// TODO Auto-generated constructor stub
	}
	
	public TestMain(int j) {
		j = j;
	}

	public static void main(String[] args) {

		TestMain t1 = new TestMain();

		t1.i = 50;

		TestMain t2 = new TestMain();

		t2.i = 75;

		System.out.println(t1.i + "  " + t2.i);
		
		TestMain t3 = new TestMain(5);

		System.out.println(t3.j);
	}

}

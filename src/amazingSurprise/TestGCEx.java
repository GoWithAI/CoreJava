package amazingSurprise;

public class TestGCEx {

	public static void main(String[] args) {
		TestGCEx t1 = new TestGCEx();
		TestGCEx t2 = m1(t1);
		TestGCEx t3 = new TestGCEx();
		t2 = t3;
	}

	static TestGCEx m1(TestGCEx temp) {
		temp = new TestGCEx();
		return temp;
	}

}

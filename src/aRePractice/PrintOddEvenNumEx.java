package aRePractice;

public class PrintOddEvenNumEx {

	public static void main(String[] args) {
		OddEven q = new OddEven();

		Thread1 t1 = new Thread1(q);
		t1.start();
		Thread2 t2 = new Thread2(q);
		t2.start();
	}

}

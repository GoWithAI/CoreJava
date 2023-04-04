package amazingSurprise;

public class FinalizeEx {

	static FinalizeEx t = new FinalizeEx();
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		FinalizeEx t1 = new FinalizeEx();
		t1 = null;

		System.gc();
		Thread.sleep(1000);

		t = null;
		System.gc();
		Thread.sleep(1000);

	}

	@Override
	protected void finalize() throws Throwable { // Only once finalize method is called
		count++;
		System.out.println(count);
	}

}

package amazingSurprise;

public class JoinMutiThreadCaseEx implements Runnable{

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new JoinMutiThreadCaseEx());
		t.start();
		Thread.sleep(1);
		System.out.println("1");
		t.join(); // wait until other thread complete its transaction
		System.out.println("2");
	} // 132 or 312

	@Override
	public void run() {
		System.out.println("3");
	}

}

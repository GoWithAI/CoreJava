package interviewQuestions1;

public class InfiniteWaitEx {

	public static void main(String[] args) {

		synchronized (args) {
			try {
				System.out.println("try-start-infinite");
				args.wait();
				System.out.println("try-end");
			} catch (InterruptedException e) {
				System.out.println("catch");
				e.printStackTrace();
			}
		}
		System.out.println("END");
	}

}

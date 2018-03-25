package lambda_expression.unit2;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(" exccute: " + this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			// System.out.println(this); This will not work
		});

		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this);// Points to reference of Process interface
			}

			public String toString() {
				return "this is anonymous inner class";
			}

		});
		
		thisReferenceExample.execute();

	}
	
	public String toString() {
		return "This is the man ThisReferenceExample class instace";
	}

}

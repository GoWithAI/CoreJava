package functionalInterfaces.custom;

public class BasicCalulator {

	private long n1;
	private long n2;

	public BasicCalulator(long n1, long n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public long proccess(Calculator calc) {
		return calc.calculator(this.n1, this.n2);
	}

	public long getN1() {
		return n1;
	}

	public void setN1(long n1) {
		this.n1 = n1;
	}

	public long getN2() {
		return n2;
	}

	public void setN2(long n2) {
		this.n2 = n2;
	}

}

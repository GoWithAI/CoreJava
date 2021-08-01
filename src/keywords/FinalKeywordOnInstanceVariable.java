package keywords;


//Initialize inside a non-static or instance block
public class FinalKeywordOnInstanceVariable {

	final Demo d = new Demo();
	
	final int x = 0;

	final int y;

	final int z;

	final static int p;
	
	final Demo d2 = new Demo();
	
	// final instance variable value we should provide
	//final static int q;

	{
		z = 9;
		System.out.println("instance block");
	}

	static {
		p = 7;
		System.out.println("static block");
	}

	public FinalKeywordOnInstanceVariable() {
		this.y = 0;
		System.out.println("Constructor");
	}

	public Demo getDemoObj() {
		return d;
	}
	
	public static void main(String[] args) {
		//
		//q=7;
		FinalKeywordOnInstanceVariable variable = new FinalKeywordOnInstanceVariable();
	}

}

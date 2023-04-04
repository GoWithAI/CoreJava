package amazingSurprise;

public class InsBlockEx {

	// Instance Block - call each time while object is getting created - In Sequence
	{
		System.out.println("init-3");
	}

	//  static variables/block are called when a class loads and static variables are called only once.
	static {
		System.out.println("static-init-3");
	}

	public InsBlockEx() {
		System.out.println("default");
	}

	public InsBlockEx(int x) {
		System.out.println(x);
	}

	{
		System.out.println("init");
	}

	static {
		System.out.println("static-init");
	}

	public static void main(String[] args) {
		new InsBlockEx();
		System.out.println("-------------");
		new InsBlockEx(10);
	}

}

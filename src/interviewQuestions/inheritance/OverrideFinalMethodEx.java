package interviewQuestions.inheritance;

class Ab {
	private int x = 0;
	private final void print() { // Only access within class , even object can not access outside class ( in other class with Ab b = new Ab();)
		System.out.println("class : Ab");
	}
}

class Sub extends Ab {
	//new method is entirely separate from superclass method ( no connection)
	public void print() { // Its new method due to "private final" in ab
		System.out.println("Class : Sub");
	}
}

public class OverrideFinalMethodEx {

	public static void main(String[] args) {
		Ab ab = new Sub();
		//ab.print(); // Ab class method not visible 
	}

}

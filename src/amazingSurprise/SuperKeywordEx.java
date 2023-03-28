package amazingSurprise;

class SuperEx {
	int speed = 100;

	String type = "a";

	void message() {
		System.out.println("message : SuperEx");
	}

}

class DerivedEx extends SuperEx {
	int speed = 80;

	void message() {
		System.out.println("message : DerivedEx");
	}

	void display() {
		System.out.println("speed :" + speed + "  super.speed :" + super.speed);
		// message();
		super.message();
		type = "b";
		System.out.println(this.type + "    " + super.type);// type is not defined in derived class
	}
}

public class SuperKeywordEx {

	public static void main(String[] args) {
		DerivedEx de = new DerivedEx();
		de.display();
	}

}

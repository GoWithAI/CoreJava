package interviewQuestions.inheritance;

class Animal2 {
	public void print() {
		System.out.println("Animal");
	}
}
class Bird2 extends Animal2{
	public void print() {
		System.out.println("Bird");
	}
	void fly() {System.out.println("Bird Flies");}
}

public class PolymorphismEx {
	public static void main(String[] args) {
		Animal2 a = new Bird2();
		a.print();
		//b.fly(); // Compile time error
	}
}

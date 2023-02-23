package design.SOLID.Liskov.problem;

public class Test {

	public static void main(String[] args) {
		Bird bird = new Penguin();
		bird.fly(); // Penguin can not fly
	}

}

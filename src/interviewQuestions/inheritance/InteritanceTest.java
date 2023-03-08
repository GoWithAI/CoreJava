package interviewQuestions.inheritance;

interface Fly{	
}

class Animal{
}

class Bird extends Animal implements Fly{
	
}

public class InteritanceTest {

	 static Animal a = new Bird();
	public static void main(String[] args) {
		
		System.out.println(a instanceof Fly);
	
	}
}

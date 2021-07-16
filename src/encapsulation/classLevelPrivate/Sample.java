package encapsulation.classLevelPrivate;

public class Sample {

	public static void main(String[] args) {
		
		Person child1 = new Person(5);
		
		Person child2 = new Person(7);
		
		child1.play(child2);

	}
	
	

}

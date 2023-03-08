package interviewQuestions.methodsAndEncapsulation;

class Animal{
	Animal(){
		super();
		System.out.println("Animal()");
	}
	Animal(String s){
		super();
		System.out.println("Animal(.....) :" + s);
	}
}

class Bird extends Animal{
	
	 Bird(String name) {
		 //super();// default super called
		 super(name);
		System.out.println(name);
	}
	
	 Bird() {
		 this("test"); // either super() or this can we be written but both
		System.out.println("Unknown");
	}
}


public class SuperInheritance {
	public static void main(String[] args) {
			new Bird("parrot"); // Trying to create object for CONSTRUCTR : private
	}
}

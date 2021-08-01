package keywords;

public class Demo {

	int i = 0;
	
	public Demo() {
		System.out.println("Demo - Instance Varible first");
	}

	
	public static void main(String[] args) {
		FinalKeywordOnInstanceVariable variable = new FinalKeywordOnInstanceVariable();
		
		Demo demoObj = variable.getDemoObj();
		
		// within final object we can change value
		demoObj.i = 5;
		
		//demoObj is type in which we are adding new obj ref, so we are not changing exiting object
		demoObj = new Demo();
	}
}

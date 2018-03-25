package lambda_expression.unit1;

public class Greeter {

	
	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//HelloWorldsGreeting helloWorldsGreeting=new HelloWorldsGreeting();
		//greeter.greet(helloWorldsGreeting);
		Greeting helloWorldsGreeting=new HelloWorldsGreeting();
		greeter.greet(helloWorldsGreeting);
		
		Greeting myLambadaFunction=() -> System.out.println("Hello World Lambda");
		
		myLambadaFunction.perform();
		
		Greeting innerClassGeetinng=new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello Inner Class");
				
			}
		};
		innerClassGeetinng.perform();
	}
}
 
interface MyLambda{
	void foo();
}
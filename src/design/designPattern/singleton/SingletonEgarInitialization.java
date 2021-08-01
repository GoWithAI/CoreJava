package design.designPattern.singleton;

//object of class is created when it is loaded to the memory by JVM
public class SingletonEgarInitialization {

	 static final SingletonEgarInitialization INITIALIZATION = new SingletonEgarInitialization();
	
	
	private SingletonEgarInitialization() {
		
	}
	
	public static SingletonEgarInitialization getInstance() {
		return INITIALIZATION;
	}
	
}

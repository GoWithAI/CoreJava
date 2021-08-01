package design.designPattern.singleton;

/***
 * It can be used in a single threaded environment because multiple threads can break 
 * singleton property because they can access get instance method simultaneously and create multiple objects. 
 * 
 * 
 * ***/
//In multithreaded environment, it may break singleton property.
public class SingletonLazyInitialization {

	private static SingletonLazyInitialization instance;

	private SingletonLazyInitialization() {
	}

	public static SingletonLazyInitialization getInstance() {
		
		if (instance == null) {
			instance = new SingletonLazyInitialization();
		}
		return instance;
	}

}

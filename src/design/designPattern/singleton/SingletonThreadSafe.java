package design.designPattern.singleton;

//made synchronized so that multiple threads can’t access it simultaneously.
public class SingletonThreadSafe {

	private static SingletonThreadSafe instance;
	
	
	private SingletonThreadSafe() {
		
	}
	
	//getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
	synchronized public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafe();
		}
		return instance;
	}
	
}

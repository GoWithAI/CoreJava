package design.designPattern.singleton.avoidCloning;

/***
 * So, if we are not implementing Cloneable interface in our Singleton class,
 * then we do not require to prevent cloning. Java will do it for us.
 **/
public class TestSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singleton1 = Singleton.singleton;
		Singleton singleton2 = (Singleton) singleton1.clone();

		System.out.println(singleton1);
		System.out.println(singleton2);
	}

}

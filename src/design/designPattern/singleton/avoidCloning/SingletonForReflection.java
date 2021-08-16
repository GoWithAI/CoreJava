package design.designPattern.singleton.avoidCloning;

public class SingletonForReflection {

	public static SingletonForReflection instance = new SingletonForReflection();

	private SingletonForReflection() {
		if (instance != null) {
			// prevent reflection from creating object
			throw new RuntimeException("breaking singleton");
		}
	}

}

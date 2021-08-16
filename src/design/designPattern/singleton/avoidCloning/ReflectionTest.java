package design.designPattern.singleton.avoidCloning;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonForReflection instance1 = SingletonForReflection.instance;
		SingletonForReflection instance2;

		Constructor<SingletonForReflection> declaredConstructor = SingletonForReflection.class.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		instance2 = declaredConstructor.newInstance();
		

		System.out.println(instance1);
		System.out.println(instance2);
	}

}

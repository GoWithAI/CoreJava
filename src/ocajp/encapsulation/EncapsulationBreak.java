package ocajp.encapsulation;

public class EncapsulationBreak {

	// 1.Due to static instance variable is associated to Class instead of object
	// 2.public static field's are associated with class not with object, it break
	// Object's encapsulation rule.
	private static String data;

	public static String getData() {
		return data;
	}

	public static void setData(String data) {
		EncapsulationBreak.data = data;
	}

}

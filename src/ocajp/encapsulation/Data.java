package ocajp.encapsulation;

// data hiding/ Encapsulation
//Encapsulation gives maintainability, flexibility and extensibility
public class Data {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value < 0) {
			System.out.println("Invalid Value,Should not be Negative");
			return;
		}

		this.value = value;
	}

}

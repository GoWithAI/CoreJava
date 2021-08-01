package comparatorVsComparableEx1;

public class Employee {

	private int i;
	private String firstName;
	private String lastName;

	public Employee(int i, String firstName, String lastName) {
		this.i = i;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "["+i + "," + firstName + "," + lastName +"]";
	}
}

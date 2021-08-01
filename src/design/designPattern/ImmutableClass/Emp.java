package design.designPattern.ImmutableClass;

// Do not provide methods that modify instance variables
public class Emp {

	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	//Immutabilty Wrong
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	//Immutabilty Wrong
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}

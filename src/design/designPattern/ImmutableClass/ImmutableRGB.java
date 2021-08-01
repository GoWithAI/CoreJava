package design.designPattern.ImmutableClass;

/**
 * 1.Don't provide "setter" methods — methods that modify fields or objects
 * referred to by fields. 
 * 2.Make all fields final and private. 
 * 3.Don't allow
 * subclasses to override methods. The simplest way to do this is to declare the
 * class as final. 
 * 3(a).A more sophisticated approach is to make the constructor
 * private and construct instances in factory methods.
 * 
 * 
 */
public final class ImmutableRGB {
	// Values of instance variable should change
	final private int red;
	final private int green;
	final private int blue;
	final private String name;
	
	//If the instance fields include references to mutable objects, don't allow those objects to be changed:
    //1. Don't provide methods that modify the mutable objects. - In case Third party lib class
    //2. Don't share references to the mutable objects. 
	//3. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. 
	//Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
	// 4.Check deep cloning and shallow cloning
	
	Emp empClone ;

	private void check(int red, int green, int blue) {
		if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
			throw new IllegalArgumentException();
		}
	}
	// If Child contructor is private then Object Creation and extending of class is not possible
	public ImmutableRGB(int red, int green, int blue, String name, Emp empClone) {
		check(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
		//Deep cloning - Initialise all your fields by deeply copying them if they are not immutable in nature 
		//this.empClone = new Emp(empClone.getId(), empClone.getName());
		this.empClone=empClone;
	}
	
	public ImmutableRGB(int red, int green, int blue, String name) {
		check(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
	}

	public int getRGB() {
		return ((red << 16) | (green << 8) | blue);
	}

	// Return Immutable object 
	public String getName() {
		return name;
	}
	
	//Wrong - do not share this mutable object 
	public Emp getEmpRef() {
		return empClone;
	}
	
	//Deep cloning/Deep cloning - do not return original object ref instead return new obj ref
	//OR Emp implements Cloneable - override clone()  > Emp emp = (Emp) super.clone();
	public Emp getEmpClone() {
		return new Emp(empClone.getId(), empClone.getName());
	}
	
	public ImmutableRGB changeName(String lastName) {
		return new ImmutableRGB(red, green, blue, name + lastName);
	}

	public ImmutableRGB invert() {
		return new ImmutableRGB(255 - red, 255 - green, 255 - blue, "Inverse of " + name);
	}
	
	// Factory method - in case of if constructor is private 
	public ImmutableRGB getRGB(int red, int green, int blue, String name) {
		return new ImmutableRGB(red, green, blue, "Inverse of " + name);
	}
	
	@Override
	public String toString() {
		return "ImmutableRGB [emp=" + empClone + "]";
	}

}

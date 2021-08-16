package design.designPattern.singleton.avoidCloning;

public class Singleton extends SuperClass {
	public static Singleton singleton = new Singleton();

	private Singleton() {

	}

	// preventing in case if super class implement Clonable interface due to which
	// object is clonable
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException(); // eighter we can throw exception or
		// we can return same object
		return singleton;// return same object
	}
	
	//we have to implement method readResolve() method. to return same object while serializing and de-serializing it
    protected Object readResolve()
    {
        return singleton;
    }
}

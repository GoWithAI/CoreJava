package design.designPattern.ImmutableClass;

// why we make Immutable class As Final ?
// 1.Don't allow subclasses to override methods.
public class Mutable extends ImmutableWithOutFinalClass {
	private int realValue;

	public Mutable(int value) {
		super(value);

		realValue = value;
	}

	// Don't allow subclasses to override methods. The simplest way to do this is to
	// declare the parent class as final
	@Override
	public int getValue() {
		return realValue;
	}

	public void setValue(int newValue) {
		realValue = newValue;
	}

	public static void main(String[] arg) {
		Mutable obj = new Mutable(4);
		ImmutableWithOutFinalClass immObj = (ImmutableWithOutFinalClass) obj;

		System.out.println(immObj.getValue());
		obj.setValue(8);
		System.out.println(immObj.getValue());
	}
}
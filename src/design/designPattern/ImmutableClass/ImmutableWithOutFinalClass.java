package design.designPattern.ImmutableClass;

public class ImmutableWithOutFinalClass {
	
	private final int value;

	public ImmutableWithOutFinalClass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
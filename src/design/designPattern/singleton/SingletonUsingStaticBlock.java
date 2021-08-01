package design.designPattern.singleton;

public class SingletonUsingStaticBlock {

	public static SingletonUsingStaticBlock instance;
	
	static {
		instance = new SingletonUsingStaticBlock();
	}
	
	private SingletonUsingStaticBlock() {

	}
	
	
}

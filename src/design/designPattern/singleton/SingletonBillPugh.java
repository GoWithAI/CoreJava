package design.designPattern.singleton;

// lazy initialization. 
//This is the most widely used approach as it doesn't use synchronization.
public class SingletonBillPugh {

	private SingletonBillPugh() {
		System.out.println("SingletonBillPugh");
	}

	private static class InstanceHolder {
		private static final SingletonBillPugh instance = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return InstanceHolder.instance;// Object already created while loading Class since static var, each call we are returning only ref
	}

}

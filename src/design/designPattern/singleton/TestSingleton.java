package design.designPattern.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		SingletonEgarInitialization instance = SingletonEgarInitialization.getInstance();
		
		SingletonUsingStaticBlock instance2 = SingletonUsingStaticBlock.instance;

		SingletonLazyInitialization instance3 = SingletonLazyInitialization.getInstance();
		
		SingletonThreadSafe instance4 = SingletonThreadSafe.getInstance();
		
		SingletonDoubleCheckLocking instance5 = SingletonDoubleCheckLocking.getInstance();
		
		SingletonBillPugh instance6 = SingletonBillPugh.getInstance();
		SingletonBillPugh instance6A = SingletonBillPugh.getInstance();
	}

}

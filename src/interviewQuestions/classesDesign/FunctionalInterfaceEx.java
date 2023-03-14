package interviewQuestions.classesDesign;

@FunctionalInterface // its optional - If declared then compile time it will show error in case of
						// multiple abstract methods
interface FunctionalInterfaceEx { // Fun interface must contain only one abstract method - why ?
	int cal(int x); // default public static abstract

	// int cal2(String s); // we can not declare abstract method 2 times
	public static String test() {
		return "";
	}

	// Instance method not allowed in interface
	// public void test2() { }

	public default String test3() {
		return "";
	}
}

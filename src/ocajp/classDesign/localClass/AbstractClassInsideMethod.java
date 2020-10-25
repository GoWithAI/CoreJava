package ocajp.classDesign.localClass;

public class AbstractClassInsideMethod {

	static int y = 0;

	public static void main(String[] args) {

		abstract class A {
			public abstract int cal(int x);

			public int cal2() {
				return 1;
			}
		}

		A a = new A() {
			@Override
			public int cal(int x) {
				return x * y;
			}

			public void print(int x) {
				System.out.println(cal(x));
			} // Can declare but not possible to access outside of method
		};

		System.out.println(a.cal(5));
	}
}

package interviewQuestions.classesDesign;

public class AbstractClassInMethodEx {

	static int y = 0;

	public static void main(String[] args) {

		// Owwww - abstract class in static methods
		abstract class A {
			public abstract int cal(int x);
		}
		// Concrete class in method
		class B {
			public int cal2(int x) {
				return 1;
			};
		}

		A a = new A() {
			@Override
			public int cal(int x) {
				return x * y;
			}

			public void print(int x) {
				System.out.println(cal(x));
			}
		};

		System.out.println("A = " + a.cal(2));

		B b = new B();
		System.out.println("B =" + b.cal2(5));
	}

	public void test() {
		abstract class A {
			public abstract int cal(int x);
		}
		// Concrete class in method
		class B {
			public int cal2(int x) {
				return 1;
			};
		}
	}

}

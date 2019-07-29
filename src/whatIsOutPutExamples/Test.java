package whatIsOutPutExamples;

class A {
	public A() {
		System.out.println("A");
	}
}
class B extends A {
	public E e = new E();
	public C c = new C();
	
	public B() {
		System.out.println("B");
	}
}
class D{
	public D() {
		System.out.println("D");
	}
}

class C extends D {
	public C() {
		System.out.println("C");
	}
}
class E{
	public E() {
		System.out.println("E");
	}
}
public class Test {

	public static void main(String[] args) {
		new B();
	}

}
//Output
//A
//E
//D
//C
//B
// First Instance Variables are Initialized then Constructor is called

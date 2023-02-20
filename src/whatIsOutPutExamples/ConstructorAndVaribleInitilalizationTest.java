package whatIsOutPutExamples;

class A {
	public A() {
		System.out.println("A");
	}
}
class B extends A {
	public E e = new E(); //call 2
	public C c = new C();// call 3
	
	public B() { 
		//1 call super 
		System.out.println("B");// call 4
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
public class ConstructorAndVaribleInitilalizationTest {

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
// First Super class constructor then Current class Instance Variables are Initialized then > current class Constructor is called

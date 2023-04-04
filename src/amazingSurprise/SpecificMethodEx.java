package amazingSurprise;

//most specific method is chosen at compile time
public class SpecificMethodEx {

	public static void a(String s) {
		System.out.println("String");
	}

	public static void a(Object s) {
		System.out.println("Object");
	}
/*
	//This leads to compile time error 
	public static void a(Integer s) {
		System.out.println(s);
	}
*/
	public static void main(String[] args) {
		a(null);
	}

}

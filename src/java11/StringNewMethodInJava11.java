package java11;

/*
isBlank, lines, strip, stripLeading, stripTrailing, repeat

*/public class StringNewMethodInJava11 {

	private static String name = "Hello";
	

	private static String name2 = "     Hello     ";
	
	
	public static void main(String[] args) {
		
		System.out.println(name.isBlank());
		
		name.lines().map( s -> s ).count();
		
		System.out.println(name);
		
		System.out.println(name2.strip());
		System.out.println(name2.stripLeading());
		System.out.println(name2.stripTrailing());
		
		System.out.println("repeat : "+ name.repeat(3));
		
	}

}

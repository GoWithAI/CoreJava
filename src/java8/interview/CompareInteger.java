package java8.interview;

public class CompareInteger {

	public static void main(String[] args) {
	    Integer a = 130;
	    Integer b = 129;
	    b++;

	    System.out.println(a == b);
	    
	    System.out.println(a.equals(b));
	}
}
package ocajp;

public class Ex3 {

	public static void main(String[] args) {

		
		try {
			Double number = Double.valueOf("120D");
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		//System.out.println(number); // Compilation

	}

}

package lambda_expression.unit8.effectiveFinal;

import java.util.function.Consumer;

public class LambadaVaribleEx1 {
	
	static int j=9;
	
	public static void main(String[] args) {
	
		int i=0;

		//Effective Final -> if any local varible is used inside of Lambda then we call that variable 
		// will be effective final
		
		j++;
		
		// can not re-declare as i : so given name other eg. i2
		Consumer<Integer> c = (i2) ->{
			//int i = 0;
			//i=6;//reassinging is not allowed
			//i++;//Local variable i defined in an enclosing scope must be final or effectively final
			j++;
			System.out.println(i+i2);
			System.out.println(j++);
			System.out.println(j+i2);
		};
		j++;
		//i++;//Local variable i defined in an enclosing scope must be final or effectively final
		c.accept(5);
		
	}

}

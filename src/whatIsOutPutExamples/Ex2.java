package whatIsOutPutExamples;

public class Ex2 {

	public static void main(String[] args) {
		// 1
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 500;
		Integer num4 = 500;

		System.out.println(num1 == num2);
		System.out.println(num3 == num4);

		// 2 blelow \... means next code should be at new line
		// \u000d		System.out.println("PRINT");
	
		 loop1:
			    for (int i = 0; i < 5; i++)
			     {
			        for (int j = 0; j < 5; j++) 
			        {
			            if (i == 3)
			                break loop1; //breaks the loop1
			            System.out.println("i = " + i + " j = " + j);
			        }
			    }
	}

}

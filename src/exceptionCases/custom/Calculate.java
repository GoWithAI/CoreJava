package exceptionCases.custom;

public class Calculate {
		static int total;
		
		public static boolean cal(int val) {
			if(val < 0) {
				throw new NegativeException();
			}else if(val < 100) {
				throw new UnExpectedInput();
			}else {
				total = val;
				return true;
			}
		}
		
		public static void main(String[] args) {
			System.out.println(" = " + cal(-1)); // Exception
			System.out.println(" = " + cal(10));// Exception
			System.out.println(" = " + cal(200));
			
		}
}

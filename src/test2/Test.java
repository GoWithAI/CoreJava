package test2;

public class Test {

	public static void main(String[] args) {
		myPrint("SKUMAR");

	}

	/**
	 * SKUMAR ====== -----S ----SK ---SKU --SKUM -SKUMA SKUMAR
	 */
	public static void myPrint(String str) { // your code goes here

		char[] chr = str.toCharArray();
		int lenght = chr.length;
		
		for (int i = 0; i < lenght; i++) {
			for (int j = (lenght - 1); j >= 0; j--) {
				int locationAfterPrintName = lenght - (i+1);	
				if(locationAfterPrintName > j) {
					System.out.print("-");	
				}else {
					System.out.print(chr[j]);		
				}
			}
			System.out.println();
		}

	}

	// {2, 1, 3, 4, 9, 7, 6} -> {1, 3, 9, 7, 2, 4, 6}
	public void arrange(int[] arr) { // your code goes here

	}

}

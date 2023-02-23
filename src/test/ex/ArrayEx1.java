package test.ex;

import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		int [] arr ={8,2,1,4,3,7,1,9,2};

		int startPoint =0;
		int endPoint = 2;
		int increamentMarker = 3;
		
		while(endPoint <= arr.length) {
			//swap	
			int temp = arr[startPoint];
			arr[startPoint] = arr[endPoint];
			arr[endPoint] = temp;
			//increament
			startPoint += increamentMarker;
			endPoint  += increamentMarker;
		}
		for(int i : arr) {
			System.out.print(i +" ");
		}
	}

}
//[1,2,8,7,3,4,2,9,1]
/*
 * select sal from emp where sal < (select max(sal) from emp order by desc)
 */


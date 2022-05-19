package SumOfAllOddLenght;

import java.util.ArrayList;

public class SumOfAllOddLength {

	public ArrayList<Integer> sum(int[] arr) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        int sum = 0 ;
        
        if(arr.length%2==1){ 		//odd
            
           for(int x:arr){ 			//gives 1,2,3,4,5
           
        	   l.add(x);
        	   
           }
           
           for(int i = arr.length; i>0; i--){
        	   sum+=i;
           }
           
           l.add(sum);
           
           return l;
        }
		return l;
	}
		 
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		SumOfAllOddLength l = new SumOfAllOddLength();
		
		System.out.println(l.sum(arr));
	}
}

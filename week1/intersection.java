package week1.day1;

import java.util.Arrays;
public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr = {1,2,11,4,6,7};
          int[] arr1 = {1,2,8,4,9,7};
          
          for (int i = 0 ; i<= arr.length-1 ; i++)
        	  
          {  
        	  for (int j = 0 ; j<= arr1.length-1 ; j++)
        		  
        	  {
        		  if (arr [i] == arr1[j])
        		  {
        			  System.out.println("The intersecting numbers are :  " + arr[i]);
        		  }
        			  
        	  }
          }
	}

}

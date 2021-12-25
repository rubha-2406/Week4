package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		List < Integer> largest = new ArrayList<Integer>();
		for (Integer temp : data)
		{
			largest.add(temp);
			
		}
			
        Collections.sort(largest);
        System.out.println(largest);
        
        int total = largest.size()-2;
        int len = largest.get(total);
        System.out.println(" The second largest number is :" + len);
        
        
        
//		Arrays.sort(data);
//		int i = data.length-2;
//		
//		System.out.println(data[i]);
//        
	}

}

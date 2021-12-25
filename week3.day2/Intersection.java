package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] loop1 = {3,2,11,4,6,7};
		int [] loop2 = {1,2,8,4,9,7};
		
//		List <Integer> values = new ArrayList < Integer> ();
//		List < Integer> values1 = new ArrayList <Integer>();
        
		for (int i =0 ; i<loop1.length ; i++)
		{
			for (int j=i ; j<loop2.length ;j++ )
			{
				if ( loop1[i] == loop2[j])
				{
					System.out.println("The intersecting numbers are " + loop1[i]);
				}
			}
		}
		

	}

}

package week1.day1;

import java.util.Arrays;

public class FindSecondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int i = data.length-2;
		
		System.out.println(data[i]);

	}

}

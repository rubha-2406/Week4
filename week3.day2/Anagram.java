package week3.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1= "stops";
		String text2= "potss";
	
		char[] ch1 = text1.toCharArray();
		
		char[] ch2 = text2.toCharArray();
		
	 	Arrays.sort(ch1);
	 	System.out.println(ch1);
	 	
		Arrays.sort(ch2);
		System.out.println(ch2);
		;
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("The given term is a anagram");
		}
		else
		{
			System.out.println("The given term is not a anagram");
		}
		
		
        
		
		
	}

}

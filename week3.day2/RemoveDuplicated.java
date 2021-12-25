package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String i = "Paypal India";
           char[] input = i.toCharArray();
           Set<Character> charset = new LinkedHashSet <Character>();
           for (Character dupcharset : input)
           {
        	   if (dupcharset !=' ')
        	   charset.add(dupcharset);
           }
           
        System.out.println(charset);   
           
           

	}

}

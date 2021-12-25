package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String comp = " We learn java basics as part of java sessions in java week1" ;
       char [] c =  comp.toCharArray();
     Set<Character> companies = new LinkedHashSet <Character>();
      for (char temp :c)
      {
    	  if (temp != ' ')
    	  {
    		  companies.add(temp);
    	  }  
    		  
      }
     System.out.println(companies);
     
    		 
    		 
     
	}

}

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List < String> input = new ArrayList <String>(); 
		input.add("TCS");
		input.add("Wipro");
		input.add("Aspire system ");
		input.add("Cts");
		
		Collections.sort(input);
        Collections.reverse(input);
        
        System.out.println(input);
		
		
	}

}

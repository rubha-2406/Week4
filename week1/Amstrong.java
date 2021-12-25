package week1.day1;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 153;
		int orgnum = input ;
		int sum =0;
		int rem ;
		while ( input > 0)
		{
			rem= input %10;
			sum =sum + (rem*rem*rem);
			input = input /10;
			
		}
     if(sum == orgnum )
    	 System.out.println("the given number is amstrong");
     else
    	 System.out.println("The given number is not a amstrong");
     
	}

}

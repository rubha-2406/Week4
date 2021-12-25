package week1.day1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "madam";
        String num2 = "";
       
        int len = num.length();
        
        for (int i = len -1 ; i >=0  ; i--)
        {
          num2 = num2 + (num.charAt(i));	
          
        }	
        if(num.equals(num2))
        {
       System.out.println("The given string is a palindrome"); 
        }
        else 
        	System.out.println("THe given string is not a palindrome");
        }
        
	
	

}

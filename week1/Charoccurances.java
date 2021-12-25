package week1.day1;


public class Charoccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcometochennai";
		
		
		
		char [] ch = new char [str.length()];
		
		for ( int i = 0 ; i < str.length() ; i++)
		{
			ch [i] = str.charAt(i);
		}
		 int k = ch.length; 
		 int count = 0 ;
		 int num =0 ;
		 for (int j = 0 ; j < k ; j++)
		 {
			 
				 if (ch[j] == 'e')
				 {
					 count ++ ;
					 

				 }
			     if (ch[j]== 'n')
			     {
			    	 num ++ ;
			    	 
			    	 
			     }
			    
		 }
		 System.out.println("The occurance of e is " + count);
		 System.out.println("The occurance of n is " + num );

	}

}

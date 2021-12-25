package week3.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String test = "$$ Welcome to the selenium  2nd week aytomation class";
      int letter =0 , space =0 , specialcharacter = 0 , number=0;
      char[] text = test.toCharArray();
      System.out.println(text);
      
      for ( int i =0 ; i < text.length ; i++)
      {
      
      				if (Character.isLetter(text[i]))
					      {
					    	  letter++;
					    	  
					      }
      				else if (Character.isDigit(text[i]))
					      {
					    	  number++;
					    	 
					      }
      				else if (Character.isSpaceChar(text[i]))
      				{
      					space++;
      					
      				}
      				else
      				{
      					specialcharacter++;
      					
      				}
      				
	}
      
      System.out.println("letter :" + letter);	
		 System.out.println("number = : " + number);
		System.out.println("space =" + space);
		System.out.println("specialcharacter" + specialcharacter);
	

	}
}




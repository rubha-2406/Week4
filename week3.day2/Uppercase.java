package week3.assignments;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Test = "changeme";
		char[] cs = Test.toCharArray();
		
		for (int i = 0 ; i<Test.length(); i++)
		{
			cs[i] = Test.charAt(i);
		}
		
		for (int j =0 ; j < cs.length ; j++ )
		{
			if (j%2==0)
			{
				char demo = Character.toUpperCase(cs[j]);
				System.out.print(demo);
			}
			else
			{
			   char	demo = Character.toLowerCase(cs[j]);
			   System.out.print(demo);
			}
			
		}
		
	}
       
}

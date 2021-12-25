package week1.day1;

public class Calculator {
	
	public int add(int num1 , int num2)
	
	{
		return num1+num2 ;
	}
	
public int sub(int num3 , int num4)
	
	{
		return num3-num4 ;
	}
	
public int mul(int num5 , int num6)

{
	return num5*num6 ;
}

public int div(int num7 , int num8)

{
	return num7/num8 ;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator calci = new Calculator() ;
     System.out.println(calci.add(10, 20));
     System.out.println(calci.sub(15,5));
     System.out.println(calci.mul(10, 10));
     System.out.println(calci.div(49, 7));
     
     
	}

}

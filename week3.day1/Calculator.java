package week3.day1;

public class Calculator {
	
	public void add (int num1 , int num2)
	{
		System.out.println("THe addition: " + (num1+num2));
	}
	public void add (int num1 , int num2 , int num3)
	
	{
		System.out.println("THe addition: " + (num1+num2+num3));
	}
	
	public void multiply (int mul1 , int mul2)
	{
		System.out.println("multiplication :" + mul1*mul2);
	}

	public void multiply (int mult1 , double mult2)
	{
		System.out.println("multiplication :" + mult1*mult2);
	}
	public void subtraction (int sub1 , int sub2)
	{
		System.out.println("Subtraction: " + (sub1-sub2));
	}	
	public void subtraction (double sub3 , double sub4)
	{
		System.out.println("Subtraction :" + (sub3-sub4));
	}
	public void divide (int div1 , int div2)
	{
		System.out.println("divide :" + div1/div2);
	}	
	public void divide (int div3 , double div4)
	{
		System.out.println("divide :" + div3/div4);
	}	
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator cal = new Calculator();
       cal.add(5, 10);
       cal.add(4, 10, 3);
       
       cal.multiply(3, 6.0);
       cal.multiply(10,2);
       
       cal.subtraction(8, 4);
       cal.subtraction(12.0, 4.0);
       
       cal.divide(10, 5);
       cal.divide(40, 4.0);
	}

}

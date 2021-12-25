package week1.day1;

public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum =0 ;
     int num1=0;
     int num2=1;
     
     System.out.println(num1);
     System.out.println(num2);
     
     for(int i=1 ; i<=6 ;i++)
     {
    	 sum = num1+num2;
     
     System.out.println(sum);
     
     num1=num2;
     num2=sum;
	}

}
}
  

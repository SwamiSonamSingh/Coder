package Swami;
//import java library
import java.util.*;
public class Num2 
{
	public static void main(String[] ar)
	{
		//taking user input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number:");
		int a=s.nextInt();
		//store the value of a for future use
		int b=a;
		//initilize value of x for store
		//reverse number
		int x=0;
		while(a!=0)
		{
			//reverse calaulation 
			int y=a%10;
			x=x*10+y;
			a=a/10;
		}
		//calculation for first digit
		int p=x%10;
		System.out.println("First Digit:"+p);
		//calculation for last digit
		int q=b%10;
		System.out.print("Last Digit:"+q);
	}
}

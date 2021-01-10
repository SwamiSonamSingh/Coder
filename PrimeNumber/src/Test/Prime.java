package Test;

//importing package for user input
import java.util.*;
public class Prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		
		//user input
		int a=sc.nextInt();
		
		//storing the value of count
		int count=0;
		
		//condition checking from 1 to a
		for(int i=1;i<=a;i++)
		{
			//check the resulting reminder if 
			//reminder is 0 then count incremented by 1
			if(a%i==0)
			count++;
		}
		//if count is 2 then there is only two divisor
		if(count==2)
		{
			System.out.println(a+"  is prime");
		}
		else
		{
			System.out.println(a+" is non prime");
		}
	}

}

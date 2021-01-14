package Num4;

//import the java package
import java.util.*;
public class Test4 
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		
		
		//initilize the value of count for store Hcf value
		int count=0;
		
		//Taking user input
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//checking the user input condition
		if(a<b)
		{
			for(int i=1;i<=a||i<=b;i++)
			{
				if(a%i==0 && b%i==0)
				{
					
					//store the value of i in count
					count=i;
				}
			}
			
			//Displaying the output
			System.out.print("HCF of "+a+" and "+b+" is:"+count);
		}
		
		//if the number entry make not sense 
		else
		{
			System.out.print("Error");
		}
	}
}

package Num3;

//importing all java package
import java.util.*;
public class Test3 
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		
		//initilize the values & set the lcm value is 0
		int lcm=0,temp,count;
		
		//taking user input as a & b
		System.out.println("Enter two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//check the condition for user input
		if(a>b)
		{
			temp=count=a;
		}
		else
		{
			temp=count=b;
		}
		
		//check the value untill a remains 0
		while(a!=0)
		{
			
			//check for both a & b for reminder
			if(temp%a==0 && temp%b==0)
			{
				
				//store the value of temp in lcm
				lcm=temp;
				break;
			}
			
			//calculate multiplyer
			temp=temp+count;
		}
		
		//enter LCM value
		System.out.print("LCM of "+a+" and "+b+" is:"+lcm);
	}	
}

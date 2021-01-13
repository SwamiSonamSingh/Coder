package Add;

//import the java package
import java.util.*;
public class Prime 
{
	public static void main(String[] ar)
	{
		
		//a blank string taken to store number
		String t="";
		
		//taking user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter nth term:");
		int a=sc.nextInt();
		
		//printing the all prime number
		System.out.print("Prime Number are:");
		
		//this is for iteration of each condition
		for(int i=1;i<=a;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				 t=t+i+",";
			}
		}
		System.out.print(t);
		}
	}

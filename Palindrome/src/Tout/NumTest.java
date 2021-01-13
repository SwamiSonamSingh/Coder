package Tout;
//import java library
import java.util.*;
public class NumTest 
{
	public static void main(String[] ar)
	{
		//taking user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int a=sc.nextInt();
		//store the value of a for further use
		int b=a;
		int p=0;
		while(a!=0)
		{
			//calculation for reverse number
			int x=a%10;
			p=p*10+x;
			a=a/10;
		}
		//b is actual value of a
		//if reverse number is same
		//as input then number is palindrome
		if(p==b)
		{
			System.out.print("Number is palindrome");
		}
		//otherwise not palinrome
		else
		{
			System.out.print("Not palindrome");
		}
	}
}

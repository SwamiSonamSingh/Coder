package Num2;
import java.util.*;
public class Test2 
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int a=sc.nextInt();
		int b=a;
		int y=0;
		
		while(a!=0)
		{
			int x=a%10;
			y=y+(x*x*x);
			a=a/10;
		}
		if(y==b)
		{
		System.out.println(y+" is Armstrong");
		}
		else
		{
			System.out.print(b+" is not Armstrong");
		}
	}
}

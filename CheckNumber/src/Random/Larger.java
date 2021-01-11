package Random;

//importing java libraries
import java.util.*;
public class Larger 
{
	public static void main(String[] ar)
	{
		
		//taking user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr lower range:");
		int a=sc.nextInt();
		System.out.print("Enetr upper range:");
		int b=sc.nextInt();
		
		//showing all numbers between a&b
		for(int i=a;i<=b;i++)
		{
			System.out.print(i+",");
		}
		
		//condtion check if entry is wrong entered by user
		if(a<b)
		{
		System.out.print("\nSmallest Number:"+a);
		System.out.print("\nLagest Number:"+b);
		}
		else
		{
			System.out.println("Entry must be wrong");
		}
	}
}

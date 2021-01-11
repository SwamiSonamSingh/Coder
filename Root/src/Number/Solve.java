package Number;

//importing java package
import java.util.*;
public class Solve 
{
	public static void main(String[] ar)
	{
		//It is used for user input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number:");
		//user input taken as number
		long a=s.nextInt();
		System.out.print("Enter power of:");
		//user input taken as power
		long b=s.nextInt();
		//use for storing the value of flag
		long flag=1;
		if(a!=0)
		{
			for(int i=1;i<=b;i++)
			{
				flag=flag*a;
			}
		//printing the result	
		System.out.println("Result:"+flag);
		}
		else 
		{
			System.out.println("Result:1");
		}
	}
}

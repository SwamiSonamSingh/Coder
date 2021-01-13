package Number;
//import thr java package for taking user input
import java.util.*;
public class Test 
{
	public static void main(String[] ar)
	{
		//user input taken
		Scanner sc=new Scanner(System.in);
		//Entering the (n+1)th term 
		System.out.print("Enter the (n+1)th term:");
		int a=sc.nextInt();
		System.out.print("Reverse:");
		//the while loop then condition untill 1
		while(a!=1)
		{
			//decrement by 1
			--a;
			//printing the rverse number
			System.out.print(a+",");
		}
	}

}

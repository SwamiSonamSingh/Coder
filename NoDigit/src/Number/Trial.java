package Number;
//import java package
import java.util.*;
public class Trial 
{
	public static void main(String[] ar)
	{
		//intilize count by 0 so that
		//it count total number of loop count
		int count=0;
		Scanner s=new Scanner(System.in);
		//taking user input
		System.out.println("Enter the number:");
		int a=s.nextInt();
		//this condition check untill
		//a remains 0 
		while(a!=0)
		{
			a=a/10;
			//in each iteration count 
			//increamented by 1
			count++;
		}		
		//showing the number of digits
		System.out.print("No of digits:"+count);
	}
}

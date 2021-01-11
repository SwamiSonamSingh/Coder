package Number;

//importing java package
import java.util.*;
public class ReverseNumber 
{
	public static void main(String[] ar)
	{
		
		//use for taking input
		Scanner s=new Scanner(System.in);
		
		//taking input by user
		System.out.print("Enetr the number:");
		int a=s.nextInt();
		
		//initilize t as 0 for storing value
		int t=0;
		
		//check the all value of a untill a remains 0
		while(a!=0) 
		{
		int y=a%10;
		t=t*10+y;
		 a=a/10;
		}
		
		//showing result
		System.out.println("Reverse number:"+t);
	}
}

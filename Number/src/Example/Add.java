package Example;

//import java library
import java.util.*;
public class Add 
{
	public static void main(String[] ar)
	{
		
		//used for user input
		Scanner s=new Scanner(System.in);
		System.out.print("Eneter the two intermediates:");
		int a=s.nextInt();
		int b=s.nextInt();
		
		//initilize variable for storing added value for even number
		int flag=0;
		
		//initilize variable for storing added value for odd number
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			System.out.print(i+",");
			
			//check the condition for even number
			if(i%2==0)
			{
			flag=flag+i;
			}
			
			//if number is not even then else run for odd number
			else
			{
				sum=sum+i;
			}
		}
		
		//printing the sum 	of odd & even number
		System.out.println("\nSum of odd integers:"+flag);
		System.out.println("Sum of odd integers:"+sum);
	}
}
package Multi;

//import the java package
import java.util.*;
public class Factorial 
{
	public static void main(String[] ar)
	{
		
		//taking user input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=s.nextInt();
		
		//initilize the variable so it can
		//store flag value
		int flag=1;
		
		//condition check for facorial of number
		for(int i=1;i<=a;i++)
		{
			
			//calculation perform
			flag=flag*i;
		}
		
		//showing output
		System.out.print(flag);
		}
	}

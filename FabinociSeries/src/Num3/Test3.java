package Num3;

//import tha java package
import java.util.*;
public class Test3 
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		
		//taking the number of terms upto want to print
		System.out.print("Enter the number of terms:");
		int a=sc.nextInt();
		
		//initilize the value of x
		int x=0;
		
		//initilize the value of y
		int y=1;
		
		//printing the value of x & y
		//or we can say that first & 
		//second term of fabinoci series
		System.out.print(x+","+y);
		
		//loop is for working upto last term
		for(int i=0;i<=a;i++)
		{
			
			//calulation to finding next term 
			int z=x+y;
			
			//printing the values
			System.out.print(","+z);
			x=y;
			y=z;
		}
	}
}

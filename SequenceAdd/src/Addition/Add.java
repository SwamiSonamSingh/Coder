package Addition;
import java.util.*;
public class Add 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number upto which you want to add:");
		int n=sc.nextInt();
		int s=0;
		for(int i=0;i<=n;i++)
		{
			s=s+n;
		}
		System.out.print("Result:"+s);
	}

}

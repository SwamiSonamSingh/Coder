package Number;

//impporting java package
import java.util.*;
public class Try 
{
	public static void main(String[] ar)
	{
		
		//Taking the input from uer
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter nfact:");
		int a=sc.nextInt();
		System.out.print("Enter rfact:");
		int b=sc.nextInt();
		
		//Condition is taken bcz if nfact<rfact then
		//calculation not possible
		if(a>b)
		{
			
			//initilize the value of flag so 
			//that it store nfact value
			int flag=1;
			
			//loop is for calculation factorial of nfact
			for(int i=1;i<=a;i++)
			{
				//calculation perform
				flag=flag*i;
			}
			
			//initilize the value so
			//that it store the value of rfact
			int count=1;
			
			//loop is for calculate the factorial of rfact
			for(int j=1;j<=b;j++)
			{
				
				//perform clculation
				count=count*j;
			}
			int p=a-b;
			
			//initilize for finding the value of a-b factorial
			int vac=1;
			for(int k=1;k<=p;k++)
			{
				//performing calculation
				vac=vac*k;
			}
			
			//storing final result & display
			int result=flag/(count*vac);
			System.out.println("The combination is:"+result);
		}
		
		//if a<b then calculation not perform
		else
		{
			System.out.println("Error");
		}
	}
}

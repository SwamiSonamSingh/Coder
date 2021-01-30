import java.util.*;
public class Arraysumdual 
{
	public static void findsum(int a[],int b[],int sum)
	{
		for(int i=0;i<a.length;i++)
		{
		int element=sum-a[i];
		int start=0;
		int end=b.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(b[mid]==element)
			{
				System.out.println(a[i]+" "+b[mid]);
				break;
			}
			else if(b[mid]>element)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
	}
}
	public static void main(String[] ar)
	{
	      Scanner sc=new Scanner(System.in);
	      int m=sc.nextInt();
	      int a[]=new int[m];
	      for(int i=0;i<m;i++)
	      {
	    	  a[i]=sc.nextInt();
	      }
	     int n=sc.nextInt();
	     int b[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 b[i]=sc.nextInt();
	     }
	     int sum=sc.nextInt();
	     findsum(a,b,sum);
	}	
}

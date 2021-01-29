package Array;
import java.util.*;
public class Sum 
{
	public static void binarysum(int arr[],int n,int sum)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of terms:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the sum you want:");
		int sum=sc.nextInt();
		binarysum(arr,n,sum);
	}
}

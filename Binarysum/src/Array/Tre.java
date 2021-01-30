package Array;
import java.util.*;
public class Tre 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++) 
        {
            a[i] = sc.nextInt();
        }
        int element=sc.nextInt();
        int start=0;
        int end=a.length-1;
        //int index=-1;
        while(start<end)
        {
    	 int mid=(start+end)/2;
    	 if(a[mid]==element)
    	 {
    		 System.out.print(mid);
    		 break;
    	 }
    	 else if(a[mid]>element)
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

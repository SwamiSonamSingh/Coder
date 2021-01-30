package Array;
import java.util.*;
public class Tre 
{
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int b[] = new int[k];
        for(int i=0;i<k;i++) {
            b[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();

        findSum(a, b, sum);
    }

    public static void findSum(int a[], int b[], int sum)
    {

        for(int i=0;i<a.length;i++) 
        {
            int elementToFind = sum - a[i];
            int start = 0;
            int end = b.length - 1;
            while (start <= end) 
            {
                int mid = (start + end) / 2;
                if(elementToFind == b[mid]) 
                {
                	System.out.println(a[i]+" "+b[mid]);
                    break;
                }
                if(elementToFind < b[mid]) 
                {
                    end = mid - 1;
                } 
                else 
                {
                    start = mid + 1;
                }
            }
        }
    }
}

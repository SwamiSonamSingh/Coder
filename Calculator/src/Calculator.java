import java.util.*;
public class Calculator 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Actions:\n1.Additon\n2.Substraction\n3.Multipliation\n4.Division\n5.Find Reminder\nEnter your choice:");
	int x=sc.nextInt();
	switch(x)
	{
	case(1):
		{
			System.out.println("Performing Addition");
			System.out.println(a+b);
			break;
		}
	case(2):
		{
			System.out.println("Performing Substration");				
			System.out.println(a-b);
			break;
		}
	case(3):
		{
			System.out.println("Performing Multiplication");
			System.out.println(a*b);
			break;
		}
	case(4):
		{
			System.out.println("Performing Division");
			System.out.println(a/b);
			break;
		}
	case(5):
		{
			System.out.println("Performing Reminder");
			System.out.println(a%b);
			break;
		}
	default:
		{
			System.out.println("Not accessed");
		}
	}
}
}


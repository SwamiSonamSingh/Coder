class Car
{
	int serial_no;
	String model;
	int year;
	int release;
	public Car(int s,int y)
	{
		this.year=y;
		this.serial_no=s;
	}
	public void setmodel(String m)
	{
		this.model=m;
	}
}
public class Rest 
{
	public static void main(String[] ar)
	{
		Car c1=new Car(2016,4);
		System.out.println(c1.year+" "+c1.serial_no);
		c1.setmodel("Xcent");
		System.out.print(c1.model);
	}
}

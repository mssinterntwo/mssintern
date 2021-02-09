import java.util.Scanner;
public class leapyear {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a year to check leap or not:");
		int year=sc.nextInt();
		if(year%400==0)
		{
			System.out.println("Leap year!!!");
		}
		else if(year%100==0)
		{
			System.out.println(" Not Leap year!!");
		}
		else if(year%4==0)
		{
			System.out.println("Leap Year!!");
			
		}
		else
		{
			System.out.println("Not a leap year!!");
			
		}
	}

}

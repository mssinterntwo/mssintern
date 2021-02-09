package project1;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) 
	{
	int month;
	Scanner a=new Scanner(System.in);
	System.out.println("enter a month from jan to dec");
	month=a.nextInt();
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
	{
     System.out.println("31 days in a month");
	}
	else if ( month == 4 || month == 6 || month == 9 || month == 11 )
	{
		System.out.println("30 days in month");
	}
	else if ( month == 2 )
	{
		System.out.println("either 28 or 29 days in month");
	}
	else
		System.out.println("enter Valid month between jan to dec");
}
}

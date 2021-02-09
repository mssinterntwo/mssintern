package project1;
import java.util.Scanner;
public class Leapyear 
{
	public static void main(String args[])
	{
		int  year;
		Scanner a= new Scanner(System.in);
		System.out.println("enter year");
		year = a.nextInt();
		a.close();
		  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		 System.out.println("given year is leap");
		  else
		System.out.println("given year is not leap");		
	}
	

}

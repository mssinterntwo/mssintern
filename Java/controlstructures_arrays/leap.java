package controlstructures_arrays;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
				int year;
				System.out.println("enter a number to find leap year or not:");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if(year%4==0) 
		{
			if(year%100==0) 
			{
				if(year%400==0) 
				{
					System.out.println("it is a leap year ");
				}
				else 
				{
					System.out.println("it is  not leap year ");
				}
			}
			else 
			{
				System.out.println("it is a leap year ");
			}
		}
		else
		{
			System.out.println("it is  not leap year");
		}			
	
}
}

package controlstructures_arrays;
import java.util.Scanner;
public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int year, month;
				Scanner s = new Scanner(System.in);
				month = s.nextInt();
				year = s.nextInt();
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					System.out.print("Number of days is 31");
				else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
				{
					System.out.print("Number of days is 29");
				}
				else if(month == 2)
				{
					System.out.print("Number of days is 28");
				}
				else {
					System.out.println("Number of days is 30");
			}
	}
}
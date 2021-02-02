package controlstructures_arrays;
import java.util.Scanner;
public class secinhour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SECONDS_PER_HOUR=3600;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Time in Minutes : ");
		int sec=in.nextInt();
		int hours=sec/SECONDS_PER_HOUR;
		System.out.println("Time in Hours : "+hours);
	}

}

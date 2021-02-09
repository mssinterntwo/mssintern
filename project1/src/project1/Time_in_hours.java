package project1;
import java.util.Scanner;
public class Time_in_hours {

	public static void main(String[] args) {
		System.out.println("enter time");
		int sec;
		Scanner a= new Scanner(System.in);
		int hours=a.nextInt();
		sec=hours*3600;
		System.out.println("time in secs\n" +sec);

	}

}

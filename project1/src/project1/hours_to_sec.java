package project1;
import java.util.Scanner;
public class hours_to_sec {

	public static void main(String[] args) {
		System.out.println("enter time");
		int hrs;
		Scanner a= new Scanner(System.in);
		int sec=a.nextInt();
		hrs=(sec/3600);
		System.out.println("time in hrs are \n" +hrs);

	}

}

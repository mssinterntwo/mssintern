package project1;
import java.util.Scanner;
public class Range1_10 {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner a= new Scanner(System.in);
		int n=a.nextInt();
	   if(n>=1 && n<=10)
		{
			System.out.println("in the range");
		}
		else
		{
			System.out.println("not in the range");
		}
	}

}

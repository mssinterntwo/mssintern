package controlstructures_arrays;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no=in.nextInt();
		int first=0;
		int second=1;
		int third;
		System.out.printf("Fibonacci Series : %d %d ",first,second);
		for (int i=2;i<no;i++) {
		third=first+second;
		System.out.printf("%d ",third);
		first=second;
		second=third;
	}
  }
}
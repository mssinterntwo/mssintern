package controlstructures_arrays;
import java.util.Scanner;
public class num_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=in.nextInt();
		int count=0;
		while(no!=0) {
		count++;
		no=no/10;
		}
		System.out.println("No of Digits in number : "+count);
	}

}

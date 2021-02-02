package controlstructures_arrays;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=in.nextInt();
		int fact=1;
		for(int j=no;j>1;j--) {
		fact=fact*j;
		}
		System.out.println("Result :"+fact);
	}

}

package controlstructures_arrays;
import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no=in.nextInt();
		if(no>0 && no<11) {
		System.out.println("Validated !!! ");
		}else {
		System.out.println("Not - Validated !!! ");
	}

  }
}
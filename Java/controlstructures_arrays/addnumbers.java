package controlstructures_arrays;
import java.util.Scanner;
public class addnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
		sum+=i;
		}

		if(sum<50) {
		System.out.println("Summation : "+sum);
		}
	}

}

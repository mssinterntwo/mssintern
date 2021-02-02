package controlstructures_arrays;
import java.util.Scanner;
public class sumalgebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n : ");
		int no=in.nextInt();
		float sum=0;
		for(int i=1;i<=no;i++) {
		sum=sum+ ((float)1/(float)i);
		}
		System.out.println("Result :"+sum);
	}
	
}

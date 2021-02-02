package controlstructures_arrays;
import java.util.Scanner;
public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no=in.nextInt();
		int sum=0;
		for(int i=1;i<no;i++) {
		if(no%i==0) {
		sum+=i;
		}
		}

		if(sum==no) {
		System.out.println("The number is Perfect Number");
		}else {
		System.out.println("The number is not a Perfect Number");
	}

  }
}


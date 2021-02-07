package number;

import java.util.Scanner;

public class ternaryForBigof3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 3 nums to find biggest of them");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int t=(x>y)? x :y ;
		int s=(t>z)? t: z ;
		System.out.println(s+"is big");
	}

}

package number;

import java.util.Scanner;

public class ternaryOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two nums to find biggest of them");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int t=(x>y)? x :y ;
		System.out.println(t+"is big");
	}

}

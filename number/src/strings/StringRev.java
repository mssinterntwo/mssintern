package strings;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		for(int i=(s1.length()-1);i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
	}

}

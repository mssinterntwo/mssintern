package strings;

import java.util.*;

public class DelNchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("enter number to cut");
		int n = sc.nextInt();
		System.out.println(s1.substring((0+n)));

	}
}
package strings;

import java.util.Scanner;

public class LenWthOutLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int i=0;
		for(char c: s1.toCharArray()) {
			i++;
		}
		System.out.println("length without length fun \n"+i);
	}

}

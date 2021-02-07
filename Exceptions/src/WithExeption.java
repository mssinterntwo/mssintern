package Exceptions;

import java.util.Scanner;
class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(int c) {
		System.out.println(c + "your r kid bro ++++");

	}
}

public class WithExeption  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age");
		int age = sc.nextInt();

		try {
			
			if (age < 18) {
				throw new MyException(age);
			}
			else {
				System.out.print("chill bro");

			}
		}
		catch (MyException b) {
			System.out.println("your r kid bro");

		}
	}
}

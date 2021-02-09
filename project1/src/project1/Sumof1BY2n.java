package project1;

import java.util.Scanner;

public class Sumof1BY2n {

	public static void main(String[] args) {
		int n,i;
		float sum=1;
		Scanner a = new Scanner(System.in);
		System.out.println("enter n:");
		n = a.nextInt();
		for(i=1;i<n;i++)
		{
			sum=sum+(float)1/(float)Math.pow(2, i);
		}
System.out.println(+sum);
	}

}

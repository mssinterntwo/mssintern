package project1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i,factorial=1,number;
		System.out.println("enter number to find factorial");
		Scanner n=new Scanner(System.in);
		number=n.nextInt();
		for(i=1;i<=number;i++)
		{
		factorial=factorial*i;
     }
  System.out.println("factorial :" +factorial);
}
}

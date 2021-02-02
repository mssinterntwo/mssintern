package controlstructures_arrays;
import java.util.Scanner;

public class even_odd {
	public static void main(String[] args) {
	int i;
	System.out.println("enter a number to find even or odd:");
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	if(i%2==0)
	{
		System.out.println("it is an even number");
	}
	else
	{
		System.out.println("it is an odd number");
	}
	}
}

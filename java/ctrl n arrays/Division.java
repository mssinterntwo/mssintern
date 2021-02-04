package project1;
import java.util.Scanner;
public class Division
{
public static void main(String [] args)
{
int number;
Scanner a= new Scanner(System.in);
System.out.println("given number is divisible by 3 and 5");
number = a.nextInt();
if ((number % 3 == 0) && (number % 5 == 0))
{
	System.out.println("given number is divisible by 3 and 5");
}
	else
	{
	System.out.println("given number is not divisible by 3 and 5");
}
}
}

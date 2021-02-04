package project1;
import java.util.Scanner;
public class Biggestnum
{
public static void main(String[] args) 
{
			Scanner a = new Scanner(System.in);		
			System.out.print("Enter the first number : ");				
			int first = a.nextInt();
			System.out.print("Enter the second number : ");				
			int second = a.nextInt();
			if(first > second)											
				System.out.println(first+" is bigger than "+second);
			else if(second > first)
				System.out.println(second+" is bigger than "+first);
			else
				System.out.println("Both numbers are Equal");
			a.close();	
	}

}

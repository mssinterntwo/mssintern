package project1;
import java.util.Scanner;
public class Neven_while 
{

	public static void main(String[] args) {
		int number, i;
		Scanner a = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = a.nextInt();	
		i = 2; 
		
		while(i <= number)
		{
			System.out.print(i +"\t"); 
			i = i + 2;

	}
	}
}

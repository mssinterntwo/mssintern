package project1;
import java.util.Scanner;
public class PassFail
{
    public static void main(String[] args)
	{
		int number;
		Scanner a = new Scanner(System.in);
		System.out.println("enter marks");
		number = a.nextInt();
		if (number > 90)
		{
			System.out.println("pass");
			System.out.println(" A grade");
		}
		else if(number > 80)
		{
			
			System.out.println("pass");
			System.out.println(" B grade");
		}
		else if(number > 70)
		{
			System.out.println("pass");
			System.out.println("C grade");
		}
		else if(number < 35)
		{
			System.out.println("fail");
			System.out.println("better luck next time");
		}

}
}

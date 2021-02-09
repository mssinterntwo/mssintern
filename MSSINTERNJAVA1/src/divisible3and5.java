import java.util.Scanner;

public class divisible3and5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check divisible by 3 and 5");
		int i=sc.nextInt();
		if((i%3==0)&&(i%5==0))
		{
			System.out.println("Divisible by 3 and 5");
		
		}
		else
		{
			System.out.println("not divisible by 3 and 5");
			
		}
	}

}

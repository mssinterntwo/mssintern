import java.util.Scanner;
public class range1to10 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		if((n<=10)&&(n>=1))
		{
			System.out.println("yes " + n + " is its in range 1 to 10");
		}
		else
		{
			System.out.println("no " + n + " is its not in range 1 to 10");
		}
	}

}

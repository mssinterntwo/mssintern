import java.util.Scanner;
public class dowhileeven{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int i=2;
		do
		{
			System.out.println(i);
			i=i+2;
		}
		while(i<=n);
	}
}
import java.util.Scanner;
public class multiplicationtable {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print its multiplication table:");
		int n=sc.nextInt();
		for(int i=1;i<=20;i++)
		{
		  System.out.println(n+"*"+i+"="+(n*i));
		}
		}
}

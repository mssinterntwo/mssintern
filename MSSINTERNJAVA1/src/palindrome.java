import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a number tocheck palindrome or not: ");
		int n=sc.nextInt();
		int rem,rev=0;
		int temp1=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp1==rev)
		{
			System.out.println(temp1 +"is a palindrome");
		}
		else
		{
			System.out.println(temp1+"is not a palindrome");
		}
	}

}

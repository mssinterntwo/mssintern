import java.util.Scanner;
public class string_palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		int count=0;
		char[] a=new char[str.length()];
		for(int i=0;i<str.length()/2;i++)
		{
			if(a[i]==a.length-i+1)
			{
				count++;
			}
		}
		if(count==((str.length()/2)+1))
		{
			System.out.println("yes Palindrome!!!!");
		}
		else
		{
			System.out.println("no,not a palindrome!!!!");
		}
	}

}
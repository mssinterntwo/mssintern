
import java.util.Scanner;
public class compare_strings {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter string1:");
		String str1=sc.nextLine();
		System.out.println("enter string2:");
		String str2=sc.nextLine();
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)==str2.charAt(i))
				{
					count=count+1;
				}
				
			}
			if(count==str1.length())
			{
			  System.out.println("same");
			}
			else
			{
				System.out.println("not same");
			}
		}
		else
		{
			System.out.println("not same");
		}
	}

}
import java.util.Scanner;
public class common_characters{
	public static void main(String[] args)
	{ 
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1:");
		String str1=sc.nextLine();
		System.out.println("enter string2:");
		String str2=sc.nextLine();
		char arr[]=new char[str1.length()];
		char[] temp=new char[str1.length()];
		for( i=0;i<str1.length();i++)
		{
			for( j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					System.out.print(str1.charAt(i));
					
				}
				
			}
		}
		
	}

}

import java.util.Scanner;
public class no_of_words {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int alphacount=0,numbercount=0,wordcount=0,i,specialchar=0;
		System.out.println("Enter some text:");
		String str=sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				wordcount=wordcount+1;
			}
			
		}
		System.out.println(wordcount+" words");
		for(i=0;i<str.length();i++)
		{
		    if(((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))||((str.charAt(i)>='a')&&(str.charAt(i)<='z')))
			{
				alphacount=alphacount+1;
			}
			else if((str.charAt(i)>='0')&&(str.charAt(i)<='9'))
			{
				numbercount=numbercount+1;
			}
			else if(str.charAt(i)!=' ')
			{
				specialchar=specialchar+1;
			}
		    
	}
		System.out.println(alphacount+" alphabets you entered");
		System.out.println(numbercount+" numbers you entered");
		System.out.println(specialchar+" special characters you entered");

}
}

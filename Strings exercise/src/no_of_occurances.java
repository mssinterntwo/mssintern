import java.util.Scanner;
public class no_of_occurances {
	public static void main(String[] args)
	{
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int count[] =new int[str.length()];
		String arr[]=new String[str.length()];
		String temp[]=new String[str.length()];
		for( i=0;i<str.length();i++)
		{
			for( j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count[i]++;
				}
			}
		}
		for(i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i)+" "+count[i];
			
		}
		int k=0;
		for(i=0;i<arr.length;i++)
		{	
			
			for(j=0;j<i;j++)
			{
				if(arr[i].compareTo(arr[j])==0) {
					break;
				}
			}
			
				if(i==j) {
					temp[k++]=arr[i];
				}
			
		}
		for(i=0;i<str.length();i++)
		{	
			if(temp[i]!=null) {
				System.out.println(temp[i]);
			}
			
		}
	}
}

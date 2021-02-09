import java.util.Scanner;
public class sumofeven {
	public static void main(String[] args)
	{   
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to finds sum of the even numbers in between them:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of even numbers upto"+n+"is:"+sum);
		
		
	}

}

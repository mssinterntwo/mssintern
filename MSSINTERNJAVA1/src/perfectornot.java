import java.util.Scanner;
public class perfectornot {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number to check perfect or not:");
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==n)
			{
				System.out.println("yes"+n+"is a perfect number:");
				
			}
			else {
				System.out.println("no"+n+"is not a perfect number:");
			}
		
		}
	}



import java.util.Scanner;
public class nprime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0,i,j;
		
		System.out.println("Enter number to find  prime numbers upto that number:");
		int n=sc.nextInt();
		
		for(i=2;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++) {
				
			
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				
			}
		}
	}

}

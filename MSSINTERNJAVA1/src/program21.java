import java.util.Scanner;

public class program21 {
	public static void main(String[] args)
	{ 
		float i;
		 float c=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		
		for( i=1;i<=n;i++)
		
		{
			c=c+(1/i);
		}
		System.out.println(c);
	}

}

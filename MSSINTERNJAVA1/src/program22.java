import java.util.Scanner;
public class program22 {
	public static void main(String[] args)
	{ 
		float i;
		 double c=1.0d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		
		for( i=1;i<=n;i++)
		
		{
			c=c+(1/(Math.pow(2,i)));
		}
		System.out.println(c);
	}

}

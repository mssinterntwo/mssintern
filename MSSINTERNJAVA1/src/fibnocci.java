import java.util.Scanner;
public class fibnocci {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to print upto its fibnocci series:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println(a+"  "+b);
		while(a<=n) { 
	    c=a+b;
		a=b;
		b=c;
		System.out.println(c);
			
		}
	    
		
		
	}

}

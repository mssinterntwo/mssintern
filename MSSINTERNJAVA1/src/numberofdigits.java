import java.util.Scanner;
public class numberofdigits {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find its number of digits:");
		int n=sc.nextInt();
	    int rem,count=0;
	    int temp1=n;
	    while(n!=0)
	    {
	    	rem=n%10;
	    	count=count+1;
	    	n=n/10;
	    }
		System.out.println("Number of digits present in "+temp1+"is"+count);
	}
}

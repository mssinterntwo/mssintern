import java.util.Scanner;
public class firstandlast {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to add its first and last digits:");
		int n=sc.nextInt();
	   int  last=n%10;
	     int first1=n/10;
	    int first=first1/10;
	     System.out.println("sum of first and last digits are"+(first+last));
	}
}


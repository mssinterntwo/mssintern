import java.util.Scanner;
public class biginnumber {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number to find big digit:");
	 int n=sc.nextInt();
	 int rem,big=0;
	 while(n!=0)
	 {
		 rem=n%10;
		 if(big<rem)
		 {
			 big=rem;
		 }
		 n=n/10;
	 }
	 System.out.println("big is :"+big);
 }
}

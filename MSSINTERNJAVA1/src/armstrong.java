import java.util.Scanner;
public class armstrong {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number to find armstrong or not:");
	 int n=sc.nextInt();
	 int temp,arm=0,rem;
	 int temp1=n;
	 while(n!=0)
	 {
		 rem=n%10;
		 arm=arm+(rem*rem*rem);
		 n=n/10;
	 }
	 if(arm==temp1)
	 {
		 System.out.println(temp1+"is an armstrong number:");
	 }
	 else
	 {
		 System.out.println(temp1+"is not an armstrong number:");
	 }
	 
 }
}

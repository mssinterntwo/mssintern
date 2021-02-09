import java.util.Scanner;
public class facorial {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int fact=1;
	 System.out.println("Enter a number to find its factorial:");
	 int n=sc.nextInt();
	 int i=1;
	 while(i<=n)
	 {
		 fact=fact*i;
		 i++;
		 
	 }
	 System.out.println("Factorial of " + n +"is "+ fact );
	 
 }}

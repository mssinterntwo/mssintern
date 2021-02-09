import java.util.Scanner;
public class biggestamongtwo {

 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter two numbers to find big number:");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 if(a>b)
	 {
		 System.out.println(a+"is big");
	 }
	 else
	 {
		 System.out.println(b+"is big");
	 }
	 
 }
}
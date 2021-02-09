import java.util.Scanner;
public class nevennumbersusingfor {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	 
	  System.out.println("enter  a  number two print even number upto that number:");
	  int n=sc.nextInt();
	  for( int i=2;i<=n;i=i+2)
	  {
		  System.out.println(i);
	  }
  }
}

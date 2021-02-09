import java.util.Scanner;
public class zero_exception {
  public static void main(String[] args)
  {
	  int c;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number1:");
	  int a=sc.nextInt();
	  System.out.println("Enter number2:");
	  int b=sc.nextInt();
	  try {
		  c=a/b;
		  System.out.println(c);
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("not divided by zero");
		  System.out.println(e);
	  }
	  finally
	  {
		  System.out.println("vennela is always a good girl");
	  }
  }
}

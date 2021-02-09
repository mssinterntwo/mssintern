import java.util.Scanner;
public class biggestamongthreeternary {
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter three numbers:");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt();
	  int n=((a>b)&&(a>c))?a:((b>a)&&(b>c))?b:c;
	  System.out.println(n+"is big among the three numbers");
	  
  }
}

package internjava;
import java.util.Scanner;
public class Divis3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner a= new Scanner( System.in);
	x=a.nextInt();
	if((x%3==0) && (x%5==0))
	{
	      System.out.println("the number is divisible by 3 and 5");
	}
	else
	{
	      System.out.println("the number is not divisible by 3 and 5");
	}
	}
}

package internjava;
import java.util.Scanner;
public class Axis{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h = new Scanner(System.in);
		int x;
		int y;
		x=h.nextInt();
		y=h.nextInt();
		if((x==0) && (y==0) )
		{
		System.out.println("the number lies at origin");

		}
		else
		{
		System.out.println("the number does not  lie at origin");
	}
	
}
}


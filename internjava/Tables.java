package internjava;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		int number, i, j;
		Scanner h= new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number=h.nextInt();

		for(i = number; i <= 10; i++)
		{
		for(j = 1; j <= 12; j++)
		{
		System.out.println(i +"  *  " + j + "  =  " + i * j);
		}
		System.out.println("================");
		}
		}
}
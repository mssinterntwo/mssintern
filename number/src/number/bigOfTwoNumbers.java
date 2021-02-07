package number;
import java.util.Scanner;
public class bigOfTwoNumbers{
	public static void main(String[] args) {
		System.out.println("enter two nums to find biggest of them");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y) {
			System.out.println(x+"is big");
		}
		else {
			System.out.println(y+"is big");
		}
	}
}

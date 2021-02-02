package controlstructures_arrays;
import java.util.Scanner;
public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("enter a number:");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		if(i%3==0&&i%5==0) {
			System.out.println("it is divisible by 3 and 5");
		    }
		else {
				System.out.println("it is not divisble by 3 and 5");
		}
	}

}

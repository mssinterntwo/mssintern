package number;
import java.util.Scanner;
public class EvenuptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num");
		
		int a=sc.nextInt();
		for (int i=0;i<=a;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}

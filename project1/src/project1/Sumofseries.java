package project1;
import java.util.Scanner;
public class Sumofseries {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the value of X :");
		int x=n.nextInt();
		System.out.println("Enter the value of N :");
		int y=n.nextInt();
		float sum=1;
		int fact=1;
		for(int i=1;i<=y;i++) {
			fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
			sum=sum+((float)Math.pow(x, i)/(float)fact);
		}
		System.out.println("sum :"+sum);
	}
}
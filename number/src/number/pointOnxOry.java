package number;
import java.util.Scanner;
public class pointOnxOry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter x and y values");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x==0&&y>0) {
	System.out.println("poin is on y axis");
				}
		else if(y==0&&x>0) {
			System.out.println("poin is on x axis");
		}
		else {
			System.out.println("poin is at origin");
		}
	}

}

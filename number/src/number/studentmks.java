package number;
import java.util.Scanner;
public class studentmks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter ur marks");
		Scanner sc= new Scanner(System.in);
		int mks=sc.nextInt();
		if(mks>30) {
			if(mks>=30&&mks<=50) {
				System.out.println("C grade");
				}
			if(mks>50&&mks<=70) {
				System.out.println("B grade");
			}
			if(mks>70) {
				System.out.println("A grade");
			}
			}
		else {
			System.out.println("failed");
		}
		}

}

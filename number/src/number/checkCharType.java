package number;
import java.util.Scanner;
public class checkCharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter something to check type");
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>=65&&a<=90) {
			System.out.println("upper case");
		}
		else if(a>=97&&a<=122) {
			System.out.println("lower case letters");
			
		}
		else if(a>=48&&a<=57) {
			System.out.println("its a number");
			
		}
		else {
		
				System.out.println("special char");
		}
		
	}

}

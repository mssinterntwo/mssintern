import java.util.Scanner;
public class Eveodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int a=s.nextInt();
	    if(a%2==0) {
		System.out.println("given number is even:"+a);
	    }
	    else {
	    	System.out.println("given number is odd:"+a);	
	}

}
}


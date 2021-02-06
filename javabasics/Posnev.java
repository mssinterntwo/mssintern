import java.util.Scanner;
public class Posnev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int a=s.nextInt();
	    if(a>0) {
		System.out.println("given number is positive:"+a);
	    }
	    else {
	    	System.out.println("given number is negative:"+a);	
	}

}
}

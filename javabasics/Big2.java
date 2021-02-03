import java.util.Scanner;
public class Big2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter x value:");
	    int x=s.nextInt();
	    System.out.println("Enter y value:");
		int y=s.nextInt();
	    if(x>y) {
		System.out.println("x is bigger than y");
	    }
	    else{
	    	System.out.println("y is bigger than x");    

	    }
	}
}

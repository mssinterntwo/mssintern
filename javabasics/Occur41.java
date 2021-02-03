import java.util.Scanner;
public class Occur41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter  number:");
	    int n=s.nextInt();
	    int count=0;
	    while(n>0) {
	    	n=n/10;
	    	count = count+1;
	    }
	    System.out.println("number of digits :"+count);
	}
	}
	    
	    

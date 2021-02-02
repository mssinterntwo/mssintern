package controlstructures_arrays;
import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner s=new Scanner(System.in);
	      int n=s.nextInt();
	      
	      int i=0;
	        do {
	    	  System.out.printf("%d",i);
		       i=i+2;
	        }while(i<=n);
	}

}

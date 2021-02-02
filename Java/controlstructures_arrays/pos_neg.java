package controlstructures_arrays;
import java.util.Scanner;

public class pos_neg {

	public static void main(String[] args) {
		int i;
	System.out.println("enter a number to find positive or negative:");
		Scanner s=new Scanner(System.in);
        i=s.nextInt();
       if(i>0) {
    	   System.out.println("it is positive value");
       }
	else if(i<0) {
            System.out.println("it is negative number");
	}
	else {
		System.out.println("the given number is neither positive nor negative");
	}
}
}

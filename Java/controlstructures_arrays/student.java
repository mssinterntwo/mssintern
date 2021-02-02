package controlstructures_arrays;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		int i;
		System.out.println("enter your marks:");
		Scanner s=new Scanner(System.in);
        i=s.nextInt();
        if(i>=35&&i<=100) {
        	if(i>=70&&i<=100) {
        		System.out.println("you got A grade");
        	}
        	else if(i>=50&&i<=69) {
        		System.out.println("you got B grade");
        	}
        	else if(i>=35&&i<=49) {
        		System.out.println("you got C grade");
        	}
        }
        else {
        	System.out.println("you are failed");
        }
	}

}

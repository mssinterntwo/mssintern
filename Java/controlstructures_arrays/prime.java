package controlstructures_arrays;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10, count;
         for (int i = 1; i<= num; i++) {
		   count = 0;
		   for (int j = 2; j<=i; j++) {
		    if (i % j == 0) {
		     count++;
		    
		    }
		   }

		   if (count == 2||count==1) {
		    System.out.println(i);
	        }

   }
 }
}
package internjava;
import java.util.*;
public class Usersinputrange {
	 public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

	      System.out.print("Enter number betwen 1 and 10: ");

	      int num = sc.nextInt();

	      if( num >= 1 && num <= 10){

	    	  System.out.println("given number is in range.");   

	            }

	      else {

	            System.out.println(" given number is out of range.");

	      }

	      System.out.println(" entered number: " + num);

	   }

	}


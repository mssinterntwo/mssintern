package internjava;
import java.util.Scanner;
		public class posneg {

			public static void main(String[] args) {

			       int number;
			       Scanner h= new Scanner (System.in);
			       number=h.nextInt();
			       if(number > 0)
			       {
			           System.out.println(number+" is a positive number");
			       }
			       else if(number < 0)
			       {
			           System.out.println(number+" is a negative number");
			       }
			       else
			       {
			           System.out.println(number+" is neither positive nor negative");
			       }
			   }
			}
	

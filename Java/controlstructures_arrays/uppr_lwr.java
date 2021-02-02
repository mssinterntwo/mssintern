package controlstructures_arrays;
import java.util.Scanner;
public class uppr_lwr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("enter a character:");
         Scanner s=new Scanner(System.in);
         char c=s.next().charAt(0);
         
         if(c>=65&&c<=90) 
        	 System.out.println("uppercase");
        else if(c>=97&&c<=122)
        System.out.println("lowercase:");	 
        else if(c>=48&&c<=57) 
        	 System.out.println("digit");
        else
            System.out.println("special character");
         }
         

}

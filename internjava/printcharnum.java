package internjava;

import java.util.Scanner;

public class printcharnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		   System.out.println("Enter something:");
		char ma=s.next().charAt(0);
		int m=ma;
		System.out.println(m);
		   if(ma>=48){
		   if((ma>=48)&&(ma<=57)) {
		   System.out.println("Digit");
		   }
		   else if((ma>=65)&&(ma<=90)) {
		    System.out.println("Uppercase");
		   }
		   else if((ma>=97)&&(ma<=122)) {
		       System.out.println("Lowercase");
		       }}
		   else {
		    System.out.println("Specialcharacter");
		   }
	}
}
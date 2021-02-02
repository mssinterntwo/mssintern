package controlstructures_arrays;
import java.util.Scanner;
public class whilejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("enter a number:");
      int i=0;
      while(i<=n) {
    	  System.out.printf("%d",i);
	       i=i+2;
	     }
    }
}

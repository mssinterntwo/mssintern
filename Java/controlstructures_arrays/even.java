package controlstructures_arrays;
import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
    
      for(int i=0;i<=n;i=i+2) {
    	  System.out.printf("%d",i);
      }
	}

}

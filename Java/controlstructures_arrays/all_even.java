package controlstructures_arrays;
import java.util.Scanner;
public class all_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int sum=0;
	  System.out.println("enter a number:");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=0;i<=n;i=i+2) {
    	  sum=sum+i;
      }
    	  
    	  System.out.printf("sum of even number"+" "+ n +" "+"is:"+sum);
      }
	}

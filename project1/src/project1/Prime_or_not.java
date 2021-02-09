package project1;
import java.util.Scanner;
public class Prime_or_not {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner a=new Scanner(System.in);
		int num = 29;
		num=a.nextInt();   
         boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}

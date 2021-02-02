package controlstructures_arrays;
import java.util.Scanner;

public class bigAmongTwo {
    
    public static void main(String[] args) {
    int a,b;
	System.out.println("enter two numbers:");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    if(a>b)
    	System.out.println("a is big");
    else
    	System.out.println("b is big");
    	
	}

}

package internjava;
import java.util.Scanner;
public class biggestamoung3numbers {
	public static void main(String args[]) 
    { 
   
        int a, b, c, f; 
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");  
		a = s.nextInt();  
		System.out.println("Enter the second number:");  
		b = s.nextInt();
		System.out.println("Enter the third number:");  
		c = s.nextInt();
        f = (a > b) ? (a > c ? a : c) : (b > c ? b : c); 
        System.out.println("Maximum number is "+f); 
    } 
}


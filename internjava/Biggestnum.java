package internjava;
import java.util.Scanner;
public class Biggestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
	 Scanner h= new Scanner(System.in);
		System.out.print(" Please Enter the First Number : ");
		a=h.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		b=h.nextInt();	
		
		if(a>b) 
	    {
			System.out.println("\n The Largest Number = " +a);          
	    } 
	    else if (a>b)
	    { 
	    	System.out.println("\n The Largest Number = " +b);        
	    } 
	    else 
	    {
	    	System.out.println("\n Both are Equal");
	    }		
	}	
	}



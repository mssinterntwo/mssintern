package internjava;
import java.util.*;
public class Multabledowhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter nuber:");
	    int n=s.nextInt();
	    int i=1;
	    do{
	    	System.out.println(n + " * " + i + " = " + n*i);
	    	
	    	i++;
	    }while(i<=12);
	}
}



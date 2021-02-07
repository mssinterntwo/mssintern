package number;
import java.util.Scanner; 
public class Factorial {
	
	
	public static void main(String... args) { 
	Scanner in=new Scanner(System.in); 
	System.out.println("Enter a number : ");
	int no=in.nextInt(); 
	int fact=1; 
	for(int j=0;j<=no;j++) { 
	fact=fact*j; 
	System.out.println("Result :"+fact); 

}
}}
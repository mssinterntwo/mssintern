package number;
import java.util.Scanner; 
public class FirstLastDigitSum {
	
	
	public static void main(String...args) { 
		
	
	Scanner in=new Scanner(System.in); 
	System.out.println("Enter a Number : ");
	int no=in.nextInt(); 
	int temp=0; 
	int last=no%10; 
	while(no!=0) { 
	temp=temp*10+(no%10); 
	no=no/10; 
	int first=temp%10;
	System.out.println("Sum of First and last digits : "+(first+last)); 
	

}
}
	
	}
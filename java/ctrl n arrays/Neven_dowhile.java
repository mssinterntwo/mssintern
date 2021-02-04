package project1;
import java.util.Scanner;
public class Neven_dowhile {

	public static void main(String[] args)
	{

			Scanner a = new Scanner(System.in);
		  System.out.print(" Enter a Number");
			int number = a.nextInt();	
			int i = 1; 
			
			do {
				if(i % 2 ==0)
			{
				System.out.print(i +"\t"); 
			   
			}
				i++;
			}
			while(i<=number);
	

	}
}

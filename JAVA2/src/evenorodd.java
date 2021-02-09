import java.util.Scanner;
public class evenorodd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("enter a number to check even or odd:");
		int number=scan.nextInt();
		if(number%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		
	}

}

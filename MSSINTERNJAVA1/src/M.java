import java.util.Scanner;
public class M {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		 int number=scan.nextInt();
        if(number>0)
        {
        	System.out.println("Positive Number");
        }
        else
        {
        	System.out.println("Negative Number");
        }
	}

}

import java.util.Scanner;
public class Palin30 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
   	 	System.out.println("Enter number:");
   	 	int n=s.nextInt();
        int  rev = 0, rem, num;
        num=n;
        while( num != 0 )
        {
            rem = num % 10;
            rev= rev * 10 + rem;
            num  = num/ 10;
        }
        if (num == rev)
            System.out.println(n+ " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}

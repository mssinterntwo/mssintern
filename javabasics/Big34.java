import java.util.Scanner;
public class Big34 {

	public static void main(String[] args) {
		Scanner cs = new Scanner (System.in);
        System.out.println ("Enter the number");
        int num = cs.nextInt ();
        int rem, big = 0;
    while (num > 0)
    {
        rem = num % 10;
        if (big< rem) 
        {
            big = rem;
        }
        num = num / 10;
    }
    System.out.println("big digit is "+big);
 }
}


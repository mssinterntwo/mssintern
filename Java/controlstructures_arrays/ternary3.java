package controlstructures_arrays;
import java.util.Scanner;
public class ternary3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,max;
        System.out.println("enter 3 numbers:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("enter largest number"+" "+max);
	}
}

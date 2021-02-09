package project1;
import java.util.Scanner;
public class Largestnumber3 {

	public static void main(String[] args) 
	{
	int a,b,c,result;
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter First Number:");
     a = sc.nextInt();
     System.out.println("Enter Second Number:");
     b = sc.nextInt();
     System.out.println("Enter third Number:");
     c= sc.nextInt();
     sc.close();
     result = c > (a>b ? a:b) ? c:((a>b) ? a:b);
    System.out.println("largest number is:"+result);

	}

}

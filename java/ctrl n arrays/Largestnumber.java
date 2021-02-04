package project1;
import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) 
	{
	int a,b,result;
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter First Number:");
     a = sc.nextInt();
     System.out.println("Enter Second Number:");
     b = sc.nextInt();
    sc.close();
    result=a>b ? a:b;
    System.out.println("largest number is:"+result);

	}

}

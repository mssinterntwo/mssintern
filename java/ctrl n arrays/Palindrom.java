package project1;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int originalnumber=n;
		int remainder=0;
		int reversednumber=0;
	  while(n!=0)
		{
			 remainder = n % 10;
	            reversednumber = reversednumber * 10 + remainder;
	               n=n/10;
		}
		System.out.println("reversednumber:" +reversednumber);
    if(reversednumber==originalnumber)
    {
    	System.out.println(originalnumber+ "palindrom");
    }
    else
    {
    	System.out.println(originalnumber+ "not palindrom");
    }
	}

}

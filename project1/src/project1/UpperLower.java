package project1;
import java.util.Scanner;
public class UpperLower 
{

	public static void main(String[] args) 
	{
      char ch;
      Scanner sc = new Scanner(System.in);
       ch = sc.next().charAt(0);
      if(ch >= 65 && ch <= 90)
      {
	System.out.println("Upper");
      }
     else if(ch >= 97 && ch <= 122)
     {
	System.out.println("lower");
     }
else if(ch >= 48 && ch <= 57)
{
	System.out.println("number");
}
else
{
	System.out.println("symbol");
}
	}
}
package project1;
import java.util.*;
public class posneg 
{
	public static void main(String[] args) 
	{
	int number;
	Scanner a=new Scanner(System.in);
	System.out.println("enter the number to cheack positive or negitive");
	number=a.nextInt();
	a.close();
	if(number > 0)
    {
        System.out.println(number+" is positive number");
    }
    else if(number < 0)
    {
        System.out.println(number+" is negative number");
    }
    else
    {
        System.out.println(number+" is neither positive nor negative");
    }
}

}



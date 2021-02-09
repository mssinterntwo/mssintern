package project1;
import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		int n,sum=0;
 	    Scanner a=new Scanner(System.in);	   	 
        System.out.println("Enter a number");
        n=a.nextInt();
        int i=1;
        while(i<=n/2)
        {
     if(n%i==0)
    {
     sum+=i;
    }
   i++;
}
   if(sum==n)
{
System.out.println(n+" is a perfect number");
   } 
else
System.out.println(n+" is not a  perfect number"); 

	}

}

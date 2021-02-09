import java.util.Scanner;
public class passedrank {
	public static void main(String [] args)
	{
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter marks:");
	   int marks=sc.nextInt();
	   if((marks>=35)&&(marks<=50))
	   {
		   System.out.println(" passed with D grade");
		   
	   }
	   else if((marks>50)&&(marks<=70))
	   {
		   System.out.println(" passed with C grade");
	   }
	   else if((marks>70)&&(marks<=90))
	   {
		   System.out.println("passed with B grade");
	   }
	   else if((marks>90)&&(marks<=100))
	   {
		   System.out.println("passsed with A grade");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
		   
	}

}

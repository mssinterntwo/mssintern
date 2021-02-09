package project1;
import java.util.Scanner;
public class PrimeNumber1_10 {

	public static void main(String[] args) {
		int number,i,count;
		System.out.println("prime nubers from 1 to 10");
		for(number=1;number<=10;number++)
		{
			count=0;
			for(i=2;i<=number/2;i++)
			{
				
				if(number %i==0)
				{
					count++;
					break;
				}
				}
			 if(count == 0 && number != 1)
			 {
				 System.out.println(number +"");
			 }
				 
	}

}
}

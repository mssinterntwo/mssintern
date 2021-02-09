import java.util.Scanner;
public class average {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		int i,avg=0,big=0,small=1;
		int a[]=new int[10];
		System.out.println("enter numbers:");
		
		for( i=0;i<10;i++) 
		{
			a[i]=sc.nextInt();
			avg=avg+a[i];
		}
				System.out.println("average is"+avg/10);
				
		for(i=0;i<10;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		
		}
		System.out.println(big+"is max");
		for(i=0;i<10;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
			
		}
		System.out.println(small+"is min");
	
	}
}

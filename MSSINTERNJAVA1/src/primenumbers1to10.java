import java.util.Scanner;
public class primenumbers1to10 {
	public static void main(String[] args)
	{
		
		int count=0,i,j;
		for(i=2;i<=10;i++)
		{
			count=0;
			for(j=1;j<=i;j++) {
				
			
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				
			}
		}
	}
}


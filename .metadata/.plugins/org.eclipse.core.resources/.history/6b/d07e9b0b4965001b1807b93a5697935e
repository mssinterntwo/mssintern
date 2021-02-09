import java.util.Scanner;
public class pyramid {
	static int fact(int num) {
		int factorial;
		
		for(factorial=1;num>1;num--)
			{
			  factorial *=num;
			}
		return factorial;
			}
	static int ncr(int n,int r)
	{
		return fact(n) / (fact(n-r) * fact(r) );
	}
	public static void main(String[]  args)
	{  
		int rows,i,j;
		System.out.println("Enter number of rows:");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<rows-i;j++){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				System.out.print(" "+ncr(i,j));
			}
			
			System.out.println();
				
			}
		}
		
	    
	        }    
		
	




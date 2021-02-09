import java.util.Scanner;
public class dowhilemultiplication {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find its multiplication table using do-while:");
		int n=sc.nextInt();
		int i=1;
		do
		{
			System.out.println(n+"*"+i+"="+(n*i));
			i=i+1;
		}
		while(i<=20);
		
		
	}

}

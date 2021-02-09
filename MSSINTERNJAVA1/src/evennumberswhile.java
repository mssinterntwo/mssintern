import java.util.Scanner;
public class evennumberswhile {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find even between that:");
		int n=sc.nextInt();
		int i=2;
		while(i<=n)
		{
			System.out.println(i);
			i=i+2;
		}
		}

}

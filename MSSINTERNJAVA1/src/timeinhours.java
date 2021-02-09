import java.util.Scanner;
public class timeinhours {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in hours:");
		int hours=sc.nextInt();
		int seconds=3600*hours;
		System.out.println(hours+" means " + seconds + "seconds");
	}

}

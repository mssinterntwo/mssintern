import java.util.Scanner;
public class secondsperhour {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of seconds:");
		int seconds=sc.nextInt();
		 final int SECONDS_PER_HOUR=3600;
		int hours=seconds/SECONDS_PER_HOUR;
		System.out.println(hours+" hours");
		}

}

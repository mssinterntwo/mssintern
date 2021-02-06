import java.util.Scanner;
public class Time38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter time in secs:");
	    float t=s.nextFloat();
	    int time = (int)t/3600;
	    System.out.println(time+ "hrs");

}
}


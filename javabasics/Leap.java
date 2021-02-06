import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a year:");
		int year=s.nextInt();
	    if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
		System.out.println("given year is leap:"+year);
	    }
	    else {
	    	System.out.println("given year is not leap:"+year);	
	}

}
}


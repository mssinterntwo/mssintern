import java.util.Scanner;
public class Daysinmnth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter  month number:");
	    int month = s.nextInt();
	    if(month == 4||month == 6||month==9||month==11) {
			System.out.printf("30 days in a given month");
	    }
	    else if(month==2) {
			System.out.printf("28/29 days in given month");
	    }
	    else {
			System.out.printf("30 days in given month");
	    }
			}

}

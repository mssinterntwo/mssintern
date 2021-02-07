package number;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		
        Scanner in=new Scanner(System.in);
		System.out.println("enter year");
		int a=in.nextInt();
		System.out.println(a);
	    if((a%4==0&&a%100!=0)||a%400==0) {
	    	System.out.println(a + "is leap");
	    	
	    }
	    else {
	    	System.out.println(a+"not leap");
	    }
	}

}

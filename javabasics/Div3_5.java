import java.util.Scanner;
public class Div3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int num=s.nextInt();
	    if(((num%3==0)&&(num%5==0))) {
		System.out.println("given num is div by both:"+num);
	    }
	    else {
	    	System.out.println("given num is can't div by both:"+num);	
	}

}
}


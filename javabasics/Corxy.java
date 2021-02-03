import java.util.Scanner;
public class Corxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a x co-ordinate:");
	    int x=s.nextInt();
	    System.out.println("Enter a y co-ordinate:");
		int y=s.nextInt();
	    if((x==0)&&(y==0)) {
		System.out.println("lies on origin");
	    }
	    else if((x!=0)&&(y==0)) {
	    	System.out.println("lies on x-axis");
	}
	    else if((x==0)&&(y!=0)){
	    	System.out.println("lies on y-axis");
	}
	    else{
	    	System.out.println("lies on quadrant");    

}
	}}


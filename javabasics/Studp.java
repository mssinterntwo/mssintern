import java.util.Scanner;
public class Studp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a student marks:");
		int ma=s.nextInt();
	    if(ma>35){
	    if((ma>=35)&&(ma<=50)) {
	    	System.out.println("student get d grade");
	    }
	    else if((ma>=51)&&(ma<=60)) {
	        System.out.println("student get c grade");
	    }
	    else if((ma>=61)&&(ma<=75)) {
	        System.out.println("student get b grade");
	    }
	    else{
	        System.out.println("student get a grade");
	    }}
	    else {
	    	System.out.println("student is fail");	
	}

}
}

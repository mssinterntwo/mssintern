import java.util.Scanner;
public class Neven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int n=s.nextInt();
	    int i=1;
	    while(i<=n){
	    	if(i%2==0) {
		System.out.println("n even numbers:"+i);
	    }
	    	i++;
	    }
	   
}
}


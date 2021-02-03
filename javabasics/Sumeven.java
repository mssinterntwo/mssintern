import java.util.Scanner;
public class Sumeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int n=s.nextInt();
	    int i=1;
	    int sum=0;
	    while(i<=n){
	    	if(i%2==0) {
	    	 sum=sum+i;
	    }
	    	i++;
	    }
	    System.out.println("sum of even numbers upto "+n+ " is " +sum);
	      
}
}




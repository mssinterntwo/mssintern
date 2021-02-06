import java.util.Scanner;
public class Read10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[]=new int[10];
		int min=a[0];
	    int max=a[0];
	    int minLoc=0;
	    int maxLoc=0;
	    int avg=0;
	    System.out.println("Enter array values:");
	    for(int i=0;i<10;i++) {
	    	a[i]=s.nextInt();
	    	avg=avg+a[i];
	    }
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]<min) {
	    		min=a[i];
	    		minLoc=i;
	    	}
	    	if(a[i]>max) {
	    		max=a[i];
	    		maxLoc=i;
	    	}
	    }
	    System.out.println("Maximum="+max);
	    System.out.println("Minimum="+min);
	    System.out.println(+avg/10);
}
}

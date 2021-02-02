package controlstructures_arrays;
import java.util.Scanner;
public class x_yaxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,y;
        System.out.println("enter co-ordinates:");
        Scanner s=new Scanner(System.in);
         x=s.nextInt();
         y=s.nextInt();
        if(x>0&&y>0)
        	System.out.println("first quadrant");
        else if(x<0&&y>0)
        	 System.out.println("second quadrant");
        else if(x<0&&y<0)
        	 System.out.println("third quadrant");
        else if(x>0&&y<0)
        	 System.out.println("fourth quadrant");
        else
        	 System.out.println("origin");
	}

}

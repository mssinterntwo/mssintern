package controlstructures_arrays;
import java.util.Scanner;
public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x,y,z;
      System.out.println("enter two numbers:");
      Scanner s=new Scanner(System.in);
      x=s.nextInt();
      y=s.nextInt();
      z=(x>y)?x:y;
      System.out.println("largest number is"+" "+z);

   }
}
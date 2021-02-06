package internjava;
import java.util.Scanner;
public class Drivencalc {
	
	public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
		   System.out.print("Enter two numbers: ");
		   double a,b,c;

		   a = h.nextDouble();
		   b=h.nextDouble();

		   System.out.print("Enter an operator (+, -, *, /): ");
		   char operator =h.next().charAt(0);

		   switch (operator) {
		     case '+':
		       c= a + b;
		       break;

		     case '-':
		      c = a - b;
		       break;

		     case '*':
		       c = a * b;
		       break;

		     case '/':
		     c = a / b;
		       break;

		     default:
		       System.out.printf("Error! operator is not correct");
		       return;
		   }

		   System.out.println(a + " " + operator + " " + b + " = " + c);
		 }


}

import java.util.Scanner;
public class Calsi {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter x value:");
	 int x=s.nextInt();
	 System.out.println("Enter y value:");
	 int y=s.nextInt();
	 System.out.print("Enter an operator (+, -, *, /):");
	 char operator = s.next().charAt(0);
	 int result;
 switch (operator) {
     case '+':
       result = x + y;
       break;

     case '-':
       result = x - y;
       break;

     case '*':
       result = x * y;
       break;

     case '/':
       result = x / y;
       break;
     default:
       System.out.printf("Enter valid operation");
       return;
   }

   System.out.println(x + " " + operator + " " + y + " = " + result);
 }
}

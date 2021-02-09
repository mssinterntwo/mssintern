package project1;
import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      int a,b,c;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      a = reader.nextInt();
      b = reader.nextInt();
      
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': c = a + b;
            break;
         case '-': c = a - b;
            break;
         case '*': c = a * b;
            break;
         case '/': c = a / b;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(a + " " + op + " " + b + " = " + c);
   }
}

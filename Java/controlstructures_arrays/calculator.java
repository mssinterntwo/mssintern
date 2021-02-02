package controlstructures_arrays;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double a,b,o;
      System.out.println("enter two numbers:");
      Scanner s=new Scanner(System.in);
      a=s.nextDouble();
      b=s.nextDouble();
      System.out.println("enter any character(+  -  *  /)");
      char c=s.next().charAt(0);
      switch(c) {
      case '+':
    	  o=a+b;
    	  break;
      case '-':
    	  o=a-b;
    	  break;
      case '*':
    	  o=a*b;
    	  break;
      case '/':
    	  o=a/b;
    	  break;
      default:
    	  System.out.println("you have entered wrong operator");
    	  return;
      }
      System.out.println(a+" "+c+" "+b+" is "+" "+ o);
      }
	}



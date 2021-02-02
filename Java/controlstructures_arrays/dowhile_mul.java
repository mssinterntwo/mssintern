package controlstructures_arrays;
import java.util.Scanner;
public class dowhile_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number to print Mutiplication table of : ");
		int no=in.nextInt();
		int i=1;
		do {
		System.out.println(no+" * "+i+" : "+(no*i));
		i++;
		}while(i<=20);
		}

	}



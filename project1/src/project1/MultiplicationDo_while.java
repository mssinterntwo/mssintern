package project1;
import java.util.Scanner;
public class MultiplicationDo_while {

	public static void main(String[] args) {
		int num;
       System.out.println("enter a number");
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		int i=1;
		do{
			System.out.println(num+"x"+i+"="+num*i);
			 i++;
			}
		while( i<=20);
		
	

	}

}

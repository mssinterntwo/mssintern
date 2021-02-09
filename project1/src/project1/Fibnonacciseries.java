package project1;
import java.util.Scanner;
public class Fibnonacciseries {

	public static void main(String[] args) {
		int n=10,t=0,t1=1;
		System.out.println("enter a number");
		Scanner a=new Scanner(System.in);
		 n=a.nextInt();
		 System.out.println("first" +n+ "terms");
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println(t+ "+");
			 int sum=t+t1;
			 t=t1;
			 t1=sum;
		 }

	}

}

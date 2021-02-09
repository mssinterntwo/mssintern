import java.util.Scanner;
public class multiplication1to10 {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 int i=1,n=10,j;
	 for(i=1;i<=10;i++)
	 {
		 for(j=1;j<=12;j++)
		 {
			 System.out.println(i+"*"+j+"="+(i*j));
		 }
	 }
 }
}

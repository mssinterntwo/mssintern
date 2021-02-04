import java.util.Scanner;
public class multiplicationtable {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter number to print Mutiplication table of : ");
int no=in.nextInt();
for(int i=1;i<=10;i++) {
System.out.println(no+" * "+i+" : "+(no*i));
}
}
}
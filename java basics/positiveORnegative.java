import java.util.Scanner;
public class positiveORnegative {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter a Number : ");
int no=in.nextInt();
if(no>0) {
System.out.println(no+" is Positive");
}else {
System.out.println(no+" is Negative");
}
}
}

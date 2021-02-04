import java.util.Scanner;
public class coordinates{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter two Coordinates (X and Y):");
int x=in.nextInt();
int y=in.nextInt();
if(x==0&&y==0) {
System.out.println("The Coordinates lies in the origin.");
}else {
System.out.println("The Coordinates doesn't lies in the origin.");
}
}
}

import java.util.Scanner;
public class whileevenuptoN {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter n : ");
int no=in.nextInt();
int i=0;
while(i<=no) {
System.out.printf("%d ",i);
i=i+2;
}
}
}
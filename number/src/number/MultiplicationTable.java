package number;
import java.util.Scanner; 
public class MultiplicationTable { 
public static void main(String[] args) {
int a;
Scanner in=new Scanner(System.in); 
System.out.println("Enter number to print Mutiplication table of : "); 
a=in.nextInt(); 
for(int i=1;i<= 10;i++) { 
System.out.println(a+" * "+i+" : "+(a*i)); 
}
}
}


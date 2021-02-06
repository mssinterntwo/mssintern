import java.util.*;
class String7 {
 public static void main(String args[]) {
 String str;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 str=sc.nextLine();
 char ch[]=str.toCharArray();
 Arrays.sort(ch);
 System.out.println(new String(ch));
}
}

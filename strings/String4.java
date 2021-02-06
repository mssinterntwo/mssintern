import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = in.nextLine();
		char s1=Character.toUpperCase(s.charAt(0));
		System.out.printf("%c", s1);
//		System.out.println(s1+s.substring(1));  
		for(int i=0;i<s.length()-1;i++) {
			if(Character.isWhitespace(s.charAt(i))) {
				System.out.printf(" %c", Character.toUpperCase(s.charAt(i+1)));
			}else {
				System.out.printf("%c", s.charAt(i+1));
			}
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class nameStr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter  names");
		
		String names =scan.nextLine();
		String[] word = names.split(" ",names.length());
	System.out.println("enter character");
	char c=scan.next().charAt(0);
	for(int i=0;i<word.length;i++) {
		if(word[i].charAt(0)==c) {
			System.out.println(word[i]);
		}
	}
	}

}
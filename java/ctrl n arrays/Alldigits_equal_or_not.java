package project1;
import java.util.Scanner;
public class Alldigits_equal_or_not {

	public static void main(String[] args) {
		int count=0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter numbers ");
		int c= a.nextInt();
				int[] numb = new int[c];
				
				for(int i=0;i<c;i++) {
					System.out.println("enter number "+(i+1)+" ");
					numb[i] = a.nextInt();
				}
			int	check=numb[0];
				for(int i=0;i<c;i++) {
					if(numb[i]==check)
						count++;
			}
				if(count==c)
				System.out.println("equal");
				else
					System.out.println("not");
	}

}

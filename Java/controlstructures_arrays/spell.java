package controlstructures_arrays;
import java.util.Scanner;
public class spell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no=in.nextInt();
		String[] digits_words_arr=

		{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

		int rev=0;

		while(no!=0) {
		rev=rev*10+(no%10);
		no=no/10;
		}
		while(rev!=0) {
		System.out.printf("%s ",digits_words_arr[rev%10]);
		rev=rev/10;
	}

   }
}
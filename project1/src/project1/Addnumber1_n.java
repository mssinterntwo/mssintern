package project1;
import java.util.Scanner;
public class Addnumber1_n {

	public static void main(String[] args) {
		int count=0,sum=0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter number");
		int c= a.nextInt();
		int[] numb = new int[c];
		for(int i=0;i<c;i++) {
			System.out.println("enter number "+(i+1)+" ");
			numb[i] = a.nextInt();
				}
		for(int j=0;j<c;j++) {
			if(j%2==0) {
				sum+=numb[j];
			}
		}
		System.out.println(sum);

	}

}

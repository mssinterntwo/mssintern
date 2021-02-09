package project1;
import java.util.Scanner;
public class Occurances_of_number {

	public static void main(String[] args) {
		int count=0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter  the number");
		int c= a.nextInt();
				int[] numb = new int[c];
				
				for(int i=0;i<c;i++) {
					System.out.println("enter number "+(i+1)+" ");
					numb[i] = a.nextInt();
				}
				System.out.println("enter number of to check occurence");
				int check= a.nextInt();
				for(int i=0;i<c;i++) {
					if(numb[i]==check)
						count++;
			}
				System.out.println(count);
			}
		}

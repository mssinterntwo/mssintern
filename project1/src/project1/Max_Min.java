package project1;
import java.util.Scanner;
public class Max_Min {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int[] num = new int[20];

		for(int i=0;i<10;i++) {
		System.out.println("enter number "+(i+1)+" ");
		num[i] = a.nextInt();
		}
		int avg=0,max=num[0],min=num[0];
		for(int i=0;i<10;i++) {
		avg=avg + num[i];
		if(min>num[i]) {
		min=num[i];
		}
		if(max<num[i]) {
		max=num[i];
		}
		}
		avg/=10;
		System.out.println("average is:"+avg+" min:"+min+" max:"+max);
		}
		}


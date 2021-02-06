import java.util.Scanner;
public class String10 {
	public static void main(String args[]) {
	String str;
	int count=0,count1=0,vl,con;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	str=sc.nextLine();
	char ch[]=str.toCharArray();
	 for(char c : ch) {
	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		 count++;
	 }
	 else {
		 count1++;
	 }
	 }
	con=count1;
	vl=count;
	System.out.println("no of vowels ="+vl);
	System.out.println("no of conosonanats ="+con);
	 }
	 }
	 

		
import java.util.Scanner;
class String2 {
 public static void main(String args[]) {
 String str;
 int count=0,sp,wds,count1=0,vl,count2=0,con, schar;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 str=sc.nextLine();
 for(int i=0;i<str.length()-1;i++) {
	if(Character.isWhitespace(str.charAt(i))) {
		count++;
	}
 }
 sp=count;
 wds = sp+1;
 System.out.println("no of words ="+wds);
 char ch[]=str.toCharArray();
 for(char c : ch) {
 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
	 count1++;
 }
 else {
	 count2++;
 }
 }
con=count2;
vl=count1;
schar=(str.length()-(wds+vl+con));
System.out.println("no of vowels ="+vl);
System.out.println("no of conosonanants ="+con);
 }
 }
 
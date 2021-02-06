import java.util.Scanner;
public class String11 {
	public static void main(String args[]) {
	String str;
	int count=0,flag=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	str=sc.nextLine();
	int ln=0;
	char ch[]=new char[str.length()];
	for(int i=0; i<str.length();i++) {
		flag=0;	
		for(int j=0; j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				flag=flag+1;
				}
		}
		int m=1;
		for(int k=0;k<ch.length;k++) {
			if(ch[k]==str.charAt(i)) {
				m=0;
			}
		}
		if(m==1) {
			ch[ln]=str.charAt(i);
			ln++;
		}
		
		if(m==1) {
		System.out.println(str.charAt(i)+" : "+flag);
		}
		          
		}	
	}
}


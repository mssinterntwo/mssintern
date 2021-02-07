package strings;
import java.util.Scanner;
public class CompTwoStrFun {
	
	static void comparefun(String s,String s1) {
		int con=0;
		if(s.length()!=s1.length()) {
			System.out.println("not matched");
		}
		else {
		for (int i=0;i<=(s.length()-1);i++) {
			for (int j=0;j<=(s1.length()-1);j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					con=con+1;
				}
			}
		}
		if(con==s.length()) {
			System.out.println("equal");
		}
		else {
			System.out.println(" not equal");
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		CompTwoStrFun obj=new CompTwoStrFun();
		obj.comparefun(str1,str2);
	}

}

public class String5 {
	void compare() {
		String s1 = "bhavani";
		String s2 = "bhavani";
		int flag=1;
		if(s1.length()==s2.length()) { 
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				flag=0;
			}
		}
		}
		if(flag==1) {
			System.out.println("equal");
			}
		else {
			System.out.println("not equal");
		}
	}
public static void main(String[] args) {
		String5 ob = new String5();
		ob.compare();
		}
	}


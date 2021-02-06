public class Try1 {
	public static void main(String args[]) {
		int a=4,b=0,c;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("hai");
	}
}	

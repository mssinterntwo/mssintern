public class Multicatch {
	public static void main(String args[]) {
		int a=4,b=0,c;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println(d);
		}
		System.out.println("hai");
	}
}

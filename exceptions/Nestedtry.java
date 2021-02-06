public class Nestedtry {
	public static void main(String args[]) {
		try {
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				try {
					int c=a/b;
				}
				catch(ArithmeticException e) {
					System.out.println(e);
				}
		}
		catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("give 2 parameters");
		}
		
		System.out.println("hai");
	}
}
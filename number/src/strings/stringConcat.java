package strings;

public class stringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "welcome";
		String st2 = "hello";
		String st3 = "hello";
		
		
		String st4=new String("hello");
		String st5=new String("hello");
		
		System.out.println(Integer.toHexString(st2.hashCode()));
		System.out.println(Integer.toHexString(st3.hashCode())); //both st2 st3 refers same location;
		st3="world";
		System.out.println(Integer.toHexString(st2.hashCode()));
		System.out.println(Integer.toHexString(st3.hashCode()));//new reference for the st3;st2 remains same
		
	}

}

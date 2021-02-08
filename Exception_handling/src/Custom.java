public class Custom {
 static void Validate(int age)throws Exception
 {
	 if(age<18)
		 throw new Exception("not valid");
 else
	 System.out.println("valid");
 }
	public static void main(String[] args) {
		try
		{
			Validate(20);
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
finally
{
	System.out.println("ramya");
}
}
}

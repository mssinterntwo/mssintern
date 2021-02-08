
public class Nested_try {

	public static void main(String[] args) {
		try{	
		       try {
					int a=20/5;
					System.out.println(a);
		       		try
		       		{
		       			int b[]=new int[5];
		       			b[5]=4;
		       		}
		       		catch(ArrayIndexOutOfBoundsException e)
		       		{
		       			System.out.println("e");
		       		}
		       }
			  catch(ArithmeticException e)
		       {
				  System.out.println("array exception");
			   }
		}
		catch(Exception e)
		{
				System.out.println("ramya");
		}
	finally
	{
	  System.out.println("im im ramya");   

	}
}
}



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class dynamicvalues {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your name:");
			String name=sc.next();
			System.out.println("enter your age");
			int age=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interndb","root","root");
	    PreparedStatement ps=con.prepareStatement("insert into new_table (name,age)  values(? ,? )");
	     int rs= ps.executeUpdate();
	    
	    System.out.println("done");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


 




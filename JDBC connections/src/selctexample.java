import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selctexample {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try
		{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interndb","root","root");
	    PreparedStatement ps=con.prepareStatement("select * from new_table");
	     ResultSet  rs= ps.executeQuery();
	     while(rs.next())
	     {
	    	 System.out.println(rs.getInt(1)+" "+rs.getNString(2)+" "+rs.getInt("age"));
	     }
	    System.out.println("done");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


 



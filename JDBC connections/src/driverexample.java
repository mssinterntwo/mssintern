import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class driverexample {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try
		{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interndb","root","root");
	    PreparedStatement ps=con.prepareStatement("insert into new_table values(1,'vennela',21)");
	    int result= ps.executeUpdate();
	    System.out.println("done");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
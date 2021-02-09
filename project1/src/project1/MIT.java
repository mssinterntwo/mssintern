
package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MIT {

	public static void main(String[] args) throws ClassNotFoundException 
	{
       Class.forName("com.mysql.jdbc.Driver");
       try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/interndb","root","root");
		System.out.println("connection established sucessfully");
		
		PreparedStatement ps=con.prepareStatement("insert into ramya(name,age) values('pavani',20)");
		int result=ps.executeUpdate();
		System.out.println(result);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

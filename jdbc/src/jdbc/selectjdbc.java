

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selectjdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		try {
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
			PreparedStatement ps=con.prepareStatement("select * from table1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+""+rs.getShort(2)+""+rs.getInt("age"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//result set,scrollable sensitive,insensitive,
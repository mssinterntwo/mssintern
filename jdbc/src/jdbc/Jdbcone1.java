package jdbc;

import java.sql.*;



public class Jdbcone1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
		PreparedStatement ps=con.prepareStatement("insert into intern1 values(2,'venuu',23)");
		ps.executeUpdate();
		System.out.println("done");
		//System.out.println("entered into batabase");
		
	}

}


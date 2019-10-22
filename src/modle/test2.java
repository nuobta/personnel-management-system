package modle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.JDBC;

public class test2 {
	public static void main(String[] args) {
		String Username="xzy1";
		try {
			Connection con=JDBC.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("select Username from user where Username ='"+Username+"'");
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		} 
		catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}

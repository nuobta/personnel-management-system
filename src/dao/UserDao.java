package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	public boolean isExist(String Username) {
		try {
			Connection con=JDBC.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("select Username from user where Username ='"+Username+"'");
		return rs.next();
        }catch (SQLException e){
			e.printStackTrace();
		}
		return false;		
   }
	public boolean adduser(String Username,String Password) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		String sql="insert into user(username,password) values(?,?)";
		
		
		try {
		con=JDBC.getConnection();
		stmt=(PreparedStatement) con.createStatement();
		stmt=con.prepareStatement(sql);
		stmt.setString(1, Username);
		stmt.setString(1, Password);
		int result=stmt.executeUpdate();
		if(result==0)return false;
		else return true;
        }catch (SQLException e){
			e.printStackTrace();
		}
		return false;
	}
}
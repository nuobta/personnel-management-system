package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class JDBC {
	
		private static final String url="jdbc:mysql://localhost:3306/demo?serverTimezone=UTC";
		private static final String user="root";
		private static final String password="xzy981231";
		private static ArrayList<Connection> conlist=new ArrayList<Connection>();
		static {
			for(int i=0;i<5;i++)
			{
				Connection con=createConnection();
				conlist.add(con);
		}}
		public static Connection getConnection() {
			if(conlist.isEmpty()==false) {
				Connection con=conlist.get(0);
				conlist.remove(con);
				return con;
			}else {
				return createConnection();
			}
		}
		public static Connection createConnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

	}

	

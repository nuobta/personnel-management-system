package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JDBC;

/**
 * Servlet implementation class registerservlet
 */
@WebServlet("/register_do")
public class registerservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			Connection con=JDBC.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("select Username from user");
		
		} 
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		doGet(request, response);
	}

}

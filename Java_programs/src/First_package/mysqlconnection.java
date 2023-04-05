package First_package;

import java.sql.*;


public class mysqlconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	    Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/yuvadb1";
	    String username = "root";
	    String password = "Yuva@1234";

	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection(url, username, password);

	      System.out.println("Connected!");

	    } catch (SQLException ex) {
	        throw new Error("Error ", ex);
	    } 
	  }
	}
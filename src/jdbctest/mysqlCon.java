package jdbctest;

import java.sql.*;

public class mysqlCon {
	 static Connection  getConnect()
	{
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url="jdbc:mysql://localhost/javadb";
			String userName="root";String password="";
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection established Sucessfully");
			
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String args[])
	{
		getConnect();
	}
	

}

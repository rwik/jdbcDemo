package jdbctest;
import java.sql.*;

public class crude {
	  static void create() throws Exception
	{
		Connection con = mysqlCon.getConnect();
		Statement st = con.createStatement();
		String qery = "insert into employee(id,name,mail) values(1,'rwik','r@g')";
		st.executeUpdate(qery);
		st.close();
		con.close();
		
	}
	public static void main (String args[])
	{
		try{
			create();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

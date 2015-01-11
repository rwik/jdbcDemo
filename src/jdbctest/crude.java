package jdbctest;
import java.sql.*;

public class crude {
	  static void create() throws Exception
	{
		Connection con = mysqlCon.getConnect();
		Statement st = con.createStatement();
		String qery = "insert into employee(id,name,mail) values(1,'test','r@g')";
		st.executeUpdate(qery);
		st.close();
		con.close();
		
	}
	 static void read() throws Exception
	{
		Connection con = mysqlCon.getConnect();
		Statement st = con.createStatement();
		String qery = "select * from employee";
		ResultSet rs = st.executeQuery(qery);
		while(rs.next())
		{
			int empId = rs.getInt(1);
			String empName = rs.getString(2);
			String empMail = rs.getString(3);
			System.out.println(empId+" "+empName+" "+empMail);
			
		}
		st.close();
		con.close();
		
	}
	 static void update() throws Exception
	 {
		 Connection con = mysqlCon.getConnect();
		 Statement st = con.createStatement();
		 String qery = "update  employee set name ='soumi' where id=1";
		 st.executeUpdate(qery);
		
		 st.close();
		 con.close();

	 }
	public static void main (String args[])
	{
		try{
			create();
			//read();
			//update();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

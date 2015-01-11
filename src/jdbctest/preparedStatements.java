
package jdbctest;
import java.sql.*;

public class preparedStatements {
	  static void create() throws Exception
	{
		Connection con = mysqlCon.getConnect();
		String qery = "insert into employee(id,name,mail) values(?,?,?)";
		PreparedStatement st = con.prepareStatement(qery);
		st.setInt(1, 11);
		st.setString(2, "lego");
		st.setString(3, "a@b");


		st.executeUpdate();//remember not to pass query here
		st.close();
		con.close();
		
	}
	 static void read() throws Exception
	{
		Connection con = mysqlCon.getConnect();
		String qery = "select * from employee";
		PreparedStatement st = con.prepareStatement(qery);

		ResultSet rs = st.executeQuery();
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
	 static void delete() throws Exception
	 {
		 Connection con = mysqlCon.getConnect();
		 String qery = "delete from  employee where name =?";
		 PreparedStatement st = con.prepareStatement(qery);
		 st.setString(1, "soumi");// here number corresponds ? mark in query
		 st.executeUpdate();		
		 st.close();
		 con.close();

	 }
	 static void update() throws Exception
	 {
		 Connection con = mysqlCon.getConnect();
		 String qery = "update  employee set name =? where id=?";
		 PreparedStatement st = con.prepareStatement(qery);
		 st.setString(1, "rwik");
		 st.setInt(2, 1);

		 st.executeUpdate();
		 st.executeUpdate();
		
		 st.close();
		 con.close();

	 }
	public static void main (String args[])
	{
		try{
			//create();
			read();
			//update();
			//delete();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

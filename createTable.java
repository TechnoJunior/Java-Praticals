//8.1 WAP to create table using JDBC

import java.sql.*;
class createTable
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:cubix");
			Statement st=con.createStatement();
			String s="insert into  rubixcube (id number,name varchar(20))";
			//String ins="insert into rubixcube  values (1,'Rubix Cube')";
			st.executeUpdate(s);
			con.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
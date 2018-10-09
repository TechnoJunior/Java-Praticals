//8.1 WAP to insert data using JDBC

import java.sql.*;
import java.util.*;
class inserttable
{
	public static void main(String args[])
	{
		char ch;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:cubix");
			Statement st=con.createStatement();
			Scanner obj=new Scanner(System.in);
			do
			{
				System.out.print("Enter Cube id : ");
				int id=obj.nextInt();
				System.out.print("Enter Cube Name : ");
				String name=obj.next();
				String s="insert into  rubixcube values('"+id+"','"+name+"')";
				st.executeUpdate(s);
				System.out.print("Do you want to continue : ");
				ch=obj.next().charAt(0);
			}while(ch=='y'||ch=='Y');
			con.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
//8.3 WAP to connect applet to database
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class studentdata extends Frame implements ActionListener
{
	Frame f;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	
	Connection con;
	Statement st;
	ResultSet rs;
	
	public studentdata()
	{
		try
		{
			f=new Frame();
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(200,200);
			
			l1=new Label("Roll");
			l1.setBounds(20,20,50,100);
			f.add(l1);
			l2=new Label("Name");
			l1.setBounds(20,40,50,100);
			f.add(l2);
			
			t1=new TextField(50);
			t1.setBounds(60,20,100,50);
			t2=new TextField(50);
			t2.setBounds(60,20,100,50);
			f.add(t1);
			f.add(t2);
			
			b1=new Button("Insert");
			b2=new Button("Delete");
			b3=new Button("Update");
			b4=new Button("Close");

			b1.setBounds(50,150,50,100);
			b2.setBounds(100,150,50,100);
			b3.setBounds(150,150,50,100);
			b4.setBounds(200,150,50,100);
			
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:cubix");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void actionPerfomed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==b1)
			{
				String s1="insert into student values('"+t1.getText()+"','"+t2.getText()+"')";
				System.out.println("Record Insert : "+s1);
				st.executeUpdate(s1);
				rs=st.executeQuery("select * from student");
				t1.setText("0");
				t2.setText("0");
			}
			else if(e.getSource()==b2)
			{
				String s2="delete from student where  Roll="+t1.getText();
				System.out.println("Record Deleted : "+s2);
				st.executeUpdate(s2);
				rs=st.executeQuery("select * from student");
				t1.setText("0");
				t2.setText("0");
			}
			else if(e.getSource()==b3)
			{
				String s3="update student set Name='"+t2.getText()+"' where Roll="+t1.getText();
				System.out.println("Record Updated : "+s3);
				st.executeUpdate(s3);
				rs=st.executeQuery("select * from student");
				t1.setText("0");
				t2.setText("0");
			}
			else if(e.getSource()==b4)
			{
				f.dispose();
				con.close();
				st.close();
			}
		}
		catch(Exception d)
		{
			System.out.println(d);
		}
	}
	public static void main(String args[])
	{
		studentdata obj=new studentdata();
	}
}
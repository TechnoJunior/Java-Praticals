//Conitnuation of 6.2
import java.io.*;
class studentdata
{
	public static void main(String args[])
	{
		student1 s=null;
		try
		{
			FileInputStream fin= new FileInputStream("abcd.aa");
			ObjectInputStream ofin=new ObjectInputStream(fin);
			s=(student1)ofin.readObject();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Student Name : "+s.name);
		System.out.println("Student Age : "+s.age);
		System.out.println("Student Phone : "+s.ph);
	}
}
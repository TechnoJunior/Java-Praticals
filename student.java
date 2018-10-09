//6.3 WAP to print student details using object format
import java.io.*;
class student1 implements Serializable
{
	String name;
	int age,ph;
}
class student
{
	public static void main(String args[])
	{
		student1 s= new student1();
		s.name="TechnoBoy";
		s.age=22;
		s.ph=123;
		try
		{
			FileOutputStream fout= new FileOutputStream("abcd.aa");
			ObjectOutputStream obj=new ObjectOutputStream(fout);
			
			obj.writeObject(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		/*fout.close();
		obj.close();*/
	}
}
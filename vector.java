import java.util.*;
class vector
{
	public static void main(String args[])
	{
		Vector<Integer> a1=new Vector<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);

		System.out.println("Integer values of Vector " +a1);

		Vector<String> s1=new Vector<String>();
		s1.add("MCA");
		s1.add("MMS");
		s1.add("BMS");

		System.out.println("String values of Vector " +s1);
	}
}

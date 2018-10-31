import java.io.*;
import java.util.*;
class book
{
	String name,aname; 
	int price;
	void get()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Book Name: ");
		name=ob.next();
		System.out.print("\nEnter Author Name: ");
		aname=ob.next();
		System.out.print("\nEnter Book Price: ");
		price=ob.nextInt();
	}
	void display()
	{
		System.out.println("\nBook Name: "+name);
		System.out.println("\nAuthor Name: "+aname);
		System.out.println("\nBook Price: "+price);
	}
}
class C extends book
{
	String name1;
	int ver;
	void get1()
	{
		get();
		Scanner ob1=new Scanner(System.in);
		System.out.print("\nEnter Software Name: ");
		name1=ob1.next();
		System.out.print("\nEnter Version Number: ");
		ver=ob1.nextInt();
	}
	void display1()
	{
		display();
		System.out.println("\nSoftware Name: "+name1);
		System.out.println("\nSoftware Version: "+ver);
	}
}
class cpp extends book
{
	String name2;
	int ver1;
	void get2()
	{
		get();
		Scanner ob2=new Scanner(System.in);
		System.out.print("\nEnter Software Name: ");
		name2=ob2.next();
		System.out.print("\nEnter Version Number: ");
		ver1=ob2.nextInt();
	}
	void display2()
	{
		display();
		System.out.println("\nSoftware Name: "+name2);
		System.out.println("\nSoftware Version: "+ver1);
	}
}
class java extends book
{
	String name3;
	int ver2;
	void get3()
	{
		get();
		Scanner ob3=new Scanner(System.in);
		System.out.println("\nEnter Software Name: ");
		name3=ob3.next();
		System.out.println("\nEnter Version Number: ");
		ver2=ob3.nextInt();
	}
	void display3()
	{
		display();
		System.out.println("\nSoftware Name: "+name3);
		System.out.println("\nSoftware Version: "+ver2);
	}
}
class MainDemo
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.get1();
		obj.display1();
		cpp obj1=new cpp();
		obj1.get2();
		obj1.display2();
		java obj2=new java();
		obj2.get3();
		obj2.display3();
	}
}

import java.io.*;
import java.util.*;
class college
{
	String name,add;
	void get()
	{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter College Name: ");
	name=ob.next();
	System.out.print("\nEnter College Address: ");
	add=ob.next();
	}
	void display()
	{
	System.out.println("\nCollege Name: "+name);
	System.out.println("\nCollege Address: "+add);
	}
}
class student extends college
{
	String name1,course;
	int roll;
	void get1()
	{
		get();
		Scanner ob1=new Scanner(System.in);
		System.out.print("\nEnter student Name: ");
		name1=ob1.next();
		System.out.print("\nEnter student Course Name: ");
		course=ob1.next();
		System.out.print("\nEnter student Roll Number: ");
		roll=ob1.nextInt();
	}
	void display1()
	{
		display();
		System.out.println("\nStudent Roll Number: "+roll);
		System.out.println("\nStudent Name: "+name1);
		System.out.println("\nStudent Course Name: "+course);
	}
}
class fees extends student
{
	double total,paid,balance;
	void get2()
	{
		get1();
		Scanner ob2=new Scanner(System.in);
		System.out.print("\nEnter total fees: ");
		total=ob2.nextDouble();
		System.out.print("\nEnter paid balance: ");
		paid=ob2.nextDouble();
	}
	void display2()
	{
		display1();
		System.out.println("\nTotal Balance: "+total);
		System.out.println("\nPaid Balance: "+paid);
		balance=total-paid;
		System.out.println("\nBalance: "+balance);
	}
}
class abc
{
	public static void main(String args[])
	{
		fees obj=new fees();
		obj.get2();
		obj.display2();
	}
}
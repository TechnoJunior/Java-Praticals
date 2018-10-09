import java.util.*;
interface FullTime
{
	void salary();
}
interface PartTime
{
	void salary1();
}
interface visiting
{
	void salary2();
}
class wages implements FullTime,PartTime,visiting
{
	public void salary()
	{
		int d,p,t;
		Scanner obj=new Scanner(System.in);
		System.out.println("--For Full Time--");
		System.out.print("Enter no of days : ");
		d=obj.nextInt();
		System.out.print("Enter Payment Amt : ");
		p=obj.nextInt();
		
		t=d*p;
		System.out.println("Salary of Full Time : "+t);
	}
	public void salary1()
	{
		int d1,p1,t1;
		Scanner obj=new Scanner(System.in);
		System.out.println("--For Part Time--");
		System.out.print("Enter no of days : ");
		d1=obj.nextInt();
		System.out.print("Enter Payment Amt :");
		p1=obj.nextInt();
		
		t1=(d1*p1)/2;
		System.out.println("Salary of Full Time : "+t1);
	}
	public void salary2()
	{
		int d2,p2,t2;
		Scanner obj=new Scanner(System.in);
		System.out.println("--For Visiting--");
		System.out.print("Enter working hours : ");
		d2=obj.nextInt();
		System.out.print("Enter Payment Amt : ");
		p2=obj.nextInt();
		
		t2=d2*p2;
		System.out.println("Salary of Full Time : "+t2);
	}
}
class calculate
{
	public static void main(String args[])
	{
		wages ob=new wages();
		ob.salary();
		ob.salary1();
		ob.salary2();
	}
}
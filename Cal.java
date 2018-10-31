import java.util.*;
interface FullTime
{
	void salary();
}
interface PartTime
{
	void salary1();
}
interface Visiting
{
	void salary2();
}
class wages implements FullTime,PartTime,Visiting
{
	public void salary()
	{
		int days;
		float pay,sal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No.Of days =  ");
		days=sc.nextInt();
		System.out.print("Enter per day payment =  ");
		pay=sc.nextFloat();
		sal=days*pay;
		System.out.println("Total Salary for FULLTIME employyes = "+sal);
	}
	public void salary1()
	{
		int days1;
		float pay1,sal1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No.Of days =  ");
		days1=sc.nextInt();
		System.out.print("Enter per day payment =  ");
		pay1=sc.nextFloat();
		sal1=days1*pay1;
		System.out.println("Total Salary for PARTTIME employyes = "+sal1);
	}
	public void salary2()
	{
		int hrs;
		float pay3,sal3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No.Of hours =  ");
		hrs=sc.nextInt();
		System.out.print("Enter per hour payment =  ");
		pay3=sc.nextFloat();
		sal3=hrs*pay3;
		System.out.println("Total Salary for FULLTIME employyes = "+sal3);
	}
}
class Cal
{
	public static void main(String args[])
	{
		wages w=new wages();
		System.out.println("*********DETAILS OF FULLTIME********");
		w.salary();

		System.out.println("*********DETAILS OF PARTTIME********");
		w.salary1();

		System.out.println("*********DETAILS OF VISITING********");
		w.salary2();
	}
}

import java.io.*;
import java.util.*;
abstract class bank
{
	abstract void intrest();
}
class SBI extends bank
{
	void intrest()
	{
		float p1,t1,r1,i1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount: ");
		p1=sc.nextFloat();
		System.out.print("\nEnter Time Period: ");
		t1=sc.nextFloat();
		System.out.print("\nEnter Rate of intrest: ");
		r1=sc.nextFloat();
		i1=(p1*r1*t1)/100;
		System.out.println("Rate Of Intrest of SBI Bank: "+i1);
	}
}
class COSMOS extends bank
{
	void intrest()
	{
		float p2,t2,r2,i2;
		Scanner sc2=new Scanner(System.in);
		System.out.print("\nEnter Amount: ");
		p2=sc2.nextFloat();
		System.out.print("\nEnter Time Period: ");
		t2=sc2.nextFloat();
		System.out.print("\nEnter Rate of intrest: ");
		r2=sc2.nextFloat();
		i2=(p2*r2*t2)/100;
		System.out.println("Rate Of Intrest of COSMOS Bank: "+i2);
	}
}
class ICICI extends bank
{
void intrest()
	{
		float p3,t3,r3,i3;
		Scanner sc3=new Scanner(System.in);
		System.out.print("Enter Amount: ");
		p3=sc3.nextFloat();
		System.out.print("\nEnter Time Period: ");
		t3=sc3.nextFloat();
		System.out.print("\nEnter Rate of intrest: ");
		r3=sc3.nextFloat();
		i3=(p3*r3*t3)/100;
		System.out.println("Rate Of Intrest of ICICI Bank: "+i3);
	}
}
class MainDemo1
{
	public static void main(String args[])
	{
		int n;
		Scanner c=new Scanner(System.in);
		System.out.print("\nSelect Bank Number: ");
		System.out.print("\n1.SBI");
		System.out.print("\n2.COSMOS");
		System.out.print("\n3.ICICI");
		System.out.print("\nEnter the Bank Number: ");
		n=c.nextInt();
		switch(n)
		{
			case 1:
			bank ob=new SBI();
			ob.intrest();
			break;
			case 2:
			bank ob1=new COSMOS();
			ob1.intrest();
			break;
			case 3:
			bank ob2=new ICICI();
			ob2.intrest();
			break;
		}
	}
}

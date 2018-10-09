import java.util.*;
abstract class Bank
{
	abstract void interest();
}
class SBI extends Bank
{
	void interest()
	{
		float p1,t1,r1,i1;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Ammount : ");
		p1=obj.nextFloat();
		System.out.print("Enter Time Period : ");
		t1=obj.nextFloat();
		System.out.print("Enter Rate of Interest");
		r1=obj.nextFloat();
		
		System.out.println("----SBI----");
		i1=(p1*r1*t1)/100;
		System.out.println("Rate of interest is : "+i1);
	}
}
class HDFC extends Bank
{
	void interest()
	{
		float p2,t2,r2,i2;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Ammount : ");
		p2=obj.nextFloat();
		System.out.print("Enter Time Period : ");
		t2=obj.nextFloat();
		System.out.print("Enter Rate of Interest");
		r2=obj.nextFloat();
		
		System.out.println("----HDFC----");
		i2=(p2*r2*t2)/100;
		System.out.println("Rate of interest is : "+i2);
	}
}

class ICIC extends Bank
{
	void interest()
	{
		float p3,t3,r3,i3;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Ammount : ");
		p3=obj.nextFloat();
		System.out.print("Enter Time Period : ");
		t3=obj.nextFloat();
		System.out.print("Enter Rate of Interest");
		r3=obj.nextFloat();
		
		System.out.println("----ICICI----");
		i3=(p3*r3*t3)/100;
		System.out.println("Rate of interest is : "+i3);
	}
}

class Banks
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1:SBI");
		System.out.println("2:HDFC");
		System.out.println("3:ICIC");
		
		int ch=ip.nextInt();
		switch(ch)
		{
			case 1:			
				Bank ob1=new SBI();
				ob1.interest();
				break;
			case 2:
				Bank ob2=new HDFC();
				ob2.interest();
				break;
			case 3:
				Bank ob3=new ICIC();
				ob3.interest();
				break;
		}
	}
}
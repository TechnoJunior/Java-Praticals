import java.util.*;
import java.math.*;
import java.io.*;
class mathFuntions
{
	void get()
	{
		Scanner sc=new Scanner(System.in);
		double f,a,n,n1,n2,n3,n4,n5,n6;
		System.out.print("Enter 1st value = ");
		a=sc.nextDouble();
		System.out.print("Enter 2nd value = ");
		f=sc.nextDouble();
		n=Math.abs(a);
		System.out.println("absolute value = "+n);
		n1=Math.pow(a,f);
		System.out.println("Power  = "+n1);
		n2=Math.sqrt(a);
		System.out.println("square of a = "+n2);
		n3=Math.min(a,f);
		System.out.println("Minimum value = "+n3);
		n4=Math.max(a,f);
		System.out.println("maximum value  = "+n4);
		n5=Math.ceil(f);
		System.out.println("ceiling value  = "+n5);
		n6=Math.floor(a);
		System.out.println("floor value  = "+n6);
	}
}
class main
{
	public static void main(String args[])
	{
		mathFuntions m=new mathFuntions();
		m.get();
	}
}

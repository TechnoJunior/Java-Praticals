import java.io.*;
import java.util.*;
class pract21
{
	double a,r,h;
	pract21()
	{
		a=1;
		r=2;
		h=3;
		System.out.println("Using default constructor");
		System.out.println("\nVolume of cube= "+(a*a*a));
		System.out.println("\nVolume of cylinder= "+(3.14*r*r*h));
		System.out.println("\nVolume of cone= "+(3.14*r*r*h/3));
	}
	pract21(double a1,double r1,double h1)
	{
		a=a1;
		r=r1;
		h=h1;
		System.out.println("\nUsing parametrized constructor");
		System.out.println("\nVolume of cube= "+(a*a*a));
		System.out.println("\nVolume of cylinder= "+(3.14*r*r*h));
		System.out.println("\nVolume of cone= "+(3.14*r*r*h/3));
	}
	pract21(pract21 obj)
	{
		a=obj.a;
		r=obj.r;
		h=obj.h;
		System.out.println("\nUsing copy constructor");
		System.out.println("\nVolume of cube= "+(a*a*a));
		System.out.println("\nVolume of cylinder= "+(3.14*r*r*h));
		System.out.println("\nVolume of cone= "+(3.14*r*r*h/3));
	}
	public static void main(String args[])
	{
		pract21 ob1=new pract21();
		pract21 ob2=new pract21(2.12,3.11,5.04);
		pract21 ob3=new pract21(ob2);
	}
}

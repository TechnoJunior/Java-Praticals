import java.util.*;
class swap<T>
{
	T a,b,c; // generic datatypes 
	swap(T a,T b)
	{
		this.a=a;
		this.b=b;		
	}
	void display()
	{
		System.out.println("Values before swapping  : a = "+a+" b = "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Values after swapping  : a = "+a+" b = "+b);
	}
	
}
class swapping
{
	public static void main(String args[])
	{
	System.out.println("                                     ");
	System.out.println("**************INTEGER VALUES*************");
	swap<Integer> s=new swap<Integer>(10,20);
	s.display();
	System.out.println("                                     ");
	System.out.println("**************FLOAT VALUES*************");
	swap<Float> f=new swap<Float>(10.3f,20.3f);
	f.display();
	System.out.println("                                     ");
	System.out.println("**************DOUBLE VALUES*************");
	swap<Double> d=new swap<Double>(10.11111,20.22222);
	d.display();
	}
}

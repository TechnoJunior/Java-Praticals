//4.2 WAP using throw and throws keyword

import java.util.*;
class Exc1
{
	public void get() throws ArithmeticException,ArrayIndexOutOfBoundsException,InputMismatchException
	{
		Scanner ob = new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a & b");
		a=ob.nextInt();
		b=ob.nextInt();
		
		if(a==0 || b==0)
		{
			throw new ArithmeticException ("Error 1.......... \n");
		}
		else if(a<0 || b<0)
		{
			throw new ArrayIndexOutOfBoundsException ("Error 2....... \n");
		}
		else if(a=='A' && a=='Z' && b=='A' && b=='Z' || a=='a' && a=='z' && b=='a' && b=='z')
		{
			throw new InputMismatchException ("Error 3....... \n");
		}
		else
		{
			System.out.println("Valid Input");
		}
	}
	public static void main(String args[])
	{
		Exc1 obj=new Exc1();
		try
		{
			obj.get();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter value greater then 0 : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please Enter positive number : "+e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter only Integer value : "+e);
		}
	}
}	
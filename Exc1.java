import java.util.*;
class Exc1
{
	public void get() throws ArithmeticException,ArrayIndexOutOfBoundsException,InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of A: ");
		a=sc.nextInt();
		System.out.println("\nEnter the value of B: ");
		b=sc.nextInt();
		if(a==0 || b==0)
		{
			throw new ArithmeticException("Error1: Provide the value which Greater Than zero(0)!!");
		}
		else if(a<0 || b<0)
		{
			throw new ArrayIndexOutOfBoundsException("Error2: Provide the Positive value!!");
		}
		else if(a=='A' && a=='Z' && b=='A' && b=='Z' || a=='a' && a=='z' && b=='a' && b=='z')
		{
			throw new InputMismatchException("Error3: Provide the numeric value!!");
		}
		else
		{
			System.out.println("Valid Input!!");
		}
	}
	public static void main(String args[])
	{
		Exc1 ob=new Exc1();
		try
		{
			ob.get();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter Value greater than zero: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please Enter only positive: "+e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter only Integer value: "+e);
		}
	}
}

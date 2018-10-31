import java.util.*;
class Exc
{  
	public static void main(String args[])
	{  
		try
		{  
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("Dividion is "+c);  
		}  
		catch(ArithmeticException e)
		{
			System.out.println("number not divisible by zero "+e);
		}  
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("For division two parameters are required "+e);
		}  
		catch(NumberFormatException e)
		{
			System.out.println("Only Integer values have to accept "+e);
		} 
		finally
		{
			System.out.println("finally block is always executed");
		}  
	}  
} 

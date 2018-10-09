//WAP of Try,Catch and finaly block

class trycatch
{
	public static void main (String args[])
	{
		try
		{
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("Division is : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number Not Divisible by 0");
		}
		catch (ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("For Division two parameters are required");
		}
		catch(NumberFormatException e2)
		{
			System.out.println("Only Integer value will be accepted");
		}
		finally
		{
			System.out.println("Close the file");
		}
	}
}
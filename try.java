//WAP of Try,Catch and finaly block

class tryy
{
	public class void main (String args[])
	{
		try
		{
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[0]);
			int c=a/b;
			System.out.println("Division is : "+c);
			catch(ArithemeticExpception)
			{
				System.out.println("Number Not Divisible by 0");
			}
		}
	}
}
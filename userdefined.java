import java.util.*;
class userpram extends Exception
{
	public String toString()
	{
		return "Invalid parameters..............";
	}
}
class userday extends Exception
{
	public String toString()
	{
		return "Invalid Days..............";
	}
}
class usermonth extends Exception
{
	public String toString()
	{
		return "Invalid Month..............";
	}
}
class userdefined
{
	public static void main(String args[])
	{
		int d,m,y;
		try
		{
			if(args.length<3)
			{
				throw new userpram();
			}
			else
			{
				d=Integer.parseInt(args[0]);
				m=Integer.parseInt(args[1]);
				y=Integer.parseInt(args[2]);
				if(d<1 || d>31)
				{
				throw new userday();
				}
				else if(m<1 || m>12)
				{
				throw new usermonth();
				}
				else
				{
				System.out.println("Valid Date!!!!");
				}
			}
		}
		catch(Exception e)
		{
		System.out.println("Provide Correct Date: "+e);
		}
	}
}

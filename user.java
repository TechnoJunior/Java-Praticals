//4.3 WAP of User Defined Exception
import java.util.*;
class userparam extends Exception
{
	public String toString()
	{
		return "Invalid Parameters ...... \n";
	}
}
class userdays extends Exception
{
	public String toString()
	{
		return "Invalid days";
	}
}
class usermonths extends Exception
{
	public String toString()
	{
		return "Invalid Month";
	}
}
class user
{
	public static void main(String args[])
	{
		int d,m,y;
		try
		{
			if(args.length<3)
			{
				throw new userparam();
			}
			else
			{
				d=Integer.parseInt(args[0]);
				m=Integer.parseInt(args[1]);
				y=Integer.parseInt(args[2]);
				if(d<1 || d>31)
				{
					throw new userdays();
				}
				if(m<1||m>12)
				{
					throw new usermonths();
				}
				else
				{
					System.out.println("Valid Date");
				}
			}
		}
		catch(userparam e)
		{
			System.out.println(e);
		}
		catch(userdays e)
		{
			System.out.println(e);
		}
		catch(usermonths e)
		{
			System.out.println(e);
		}
	}
}
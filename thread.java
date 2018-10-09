// 5.1 WAP of multi threading using extend interface 
// 5.1 WAP of multi threading using implements interface 

class FirstThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("First Thread "+i);
		}
		System.out.println("My First Thread");
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Second Thread "+i);
		}
		System.out.println("My Second Thread");
	}
}
class thread
{
	public static void main(String args[])
	{
		FirstThread obj = new FirstThread();
		SecondThread obj1 = new SecondThread();
		
		obj.start();
		obj1.start();
	}
}
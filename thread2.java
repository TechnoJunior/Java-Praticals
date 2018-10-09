// 5.3 WAP of sleep and join method using thread

class Mythread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("My Thread "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class thread2
{
	public static void main(String args[])
	{
		Mythread obj = new Mythread();		
		obj.start();
		try
		{
			obj.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Mythread obj1 = new Mythread();		
		obj1.start();
		Mythread obj2 = new Mythread();		
		obj2.start();
	}
}
// 5.2 WAP of multi threading using implements interface 

class FirstThread implements Runnable
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
class SecondThread implements Runnable
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
class thread1
{
	public static void main(String args[])
	{
		FirstThread obj = new FirstThread();
		SecondThread obj1 = new SecondThread();
		Thread f=new Thread(obj);
		Thread s=new Thread(obj1);
		f.start();
		s.start();
	}
}
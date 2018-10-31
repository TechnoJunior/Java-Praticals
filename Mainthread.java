class FirstThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("First Thread: "+i);
		}
		System.out.println("\nFirst Thread");
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("\nSecond Thread: "+i);
		}
		System.out.println("\nSecond Thread");
	}
}
class Mainthread
{
	public static void main(String args[])
	{
		FirstThread ft=new FirstThread();
		SecondThread st=new SecondThread();
		ft.start();
		st.start();
	}
}

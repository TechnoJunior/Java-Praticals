//5.4 WAP to print Table1 using synchronize Table1
class Table1
{
	synchronized void print(int n)
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}   
class FirstThread extends Thread
{
	Table1 t;
	FirstThread (Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println("First Table");
		t.print(3);
	}
}
class SecondThread extends Thread
{
	Table1 t;
	SecondThread (Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println("Second Table");
		t.print(15);
	}
}
class ThirdThread extends Thread
{
	Table1 t;
	ThirdThread (Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println("Third Table");
		t.print(25);
	}
}
class Table
{
	public static void main(String args[])
	{
		Table1 obj=new Table1();
		FirstThread obj1=new FirstThread(obj);
		obj1.start();
		
		SecondThread obj2=new SecondThread(obj);
		obj2.start();
		
		ThirdThread obj3=new ThirdThread(obj);
		obj3.start();
	}
}
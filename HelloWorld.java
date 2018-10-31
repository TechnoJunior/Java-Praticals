public class HelloWorld
{
	public static void main(String args[])
	{
		HelloWorld abc=new HelloWorld();
		abc.add(20,30);
		abc.print()
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is :"+c);
	}
}
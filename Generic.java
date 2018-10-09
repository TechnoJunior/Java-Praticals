//3.1 WAP of Generic Class and Generic method

class swap <T>
{
	T a,b,c;
	swap(T a,T b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("Before Swapping");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
}
class Generic
{
	public static void main(String args[])
	{
		System.out.println(":::Integer:::");
		swap <Integer> ob = new swap <Integer> (10,20);
		ob.disp();
		System.out.println(":::Float:::");
		swap <Float> ob1 = new swap <Float> (10f,20f);
		ob1.disp();
		System.out.println(":::Double:::");
		swap <Double> ob2 = new swap <Double> (10.22,20.12);
		ob2.disp();
	}
}
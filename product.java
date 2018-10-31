import java.io.*;
import java.util.*;
class product
{
	String product_name;
	int prod_quantity,price,total;
	static int count=0;
	product()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nWelcome to Rubix Cube Shopping");
		System.out.print("\nEnter product name: ");
		product_name=sc.nextLine();
		System.out.print("\nEnter Product price: ");
		price=sc.nextInt();
		System.out.print("\nEnter product Quantity: ");
		prod_quantity=sc.nextInt();
		System.out.println("Total Bill: "+(price*prod_quantity));
	}
	static void disp()
	{
		++count;
		System.out.println("Customer No.: "+count);
	}
	static
	{
		System.out.println("\t\t****Product Details****");
	}
	public static void main(String args[])
	{
		product ob1=new product();
		product.disp();
		product ob2=new product();
		product.disp();
		product ob3=new product();
		product.disp();
	}
}

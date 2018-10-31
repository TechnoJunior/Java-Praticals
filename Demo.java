import java.io.*;
import java.util.*;
class Demo
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,fact=1,a=0,b=1,c,num;
		char choice;
		do{
		System.out.println("1.Factorial");
		System.out.println("\n2.Fibonacci series");
		System.out.println("\n3.Even & Odd");
		System.out.println("\n4.Multiplication table");
		System.out.println("\nEnter your choice");
		n=sc.nextInt();
		switch(n)
		{
		case 1:
		System.out.println("Enter no.:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
		fact=fact*i;
		}
		System.out.println("The factorial no. is"+fact);
		break;
		case 2:
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		System.out.print(a+" ");
		while(a<=num1)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.print(a+ "\t");
		}
		break;
		case 3:
		System.out.println("enter a no.");
		int number=sc.nextInt();
		if(number%2==0)
		{
		System.out.println("Number is even");
		}
		else
		{
		System.out.println("Number is odd");
		}
		break;
		case 4:
		int tableSize=10;

		System.out.format("      ");
		for(int i = 1; i<=tableSize;i++ ) 
		{
		System.out.format("%4d",i);
				}
		System.out.println();
		System.out.println("----------------------------------------------");
		for(int i = 1 ;i<=tableSize;i++) 
		{
		System.out.format("%4d |",i);
		for(int j=1;j<=tableSize;j++) 
		{
		System.out.format("%4d",i*j);
					}
		System.out.println();
				}
		break;
		}
		System.out.println("\nDo you want to continue[Y/N]:");
		choice=sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}
}

import java.io.*;
import java.util.*;
class Demo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,rev=0,rem;
System.out.println("1.Reverse Number");
System.out.println("2.Sum of Digits");
System.out.println("3.Palindrome");
System.out.println("Enter your choice: ");
n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("\nEnter Integer: ");
int num=sc.nextInt();
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("Reverse Number: "+rev);
break;
case 2:
System.out.println("\nEnter Integer: ");
int num1=sc.nextInt();
while(num1!=0)
{
rem=num1%10;
rev=rev+rem;
num1=num1/10;
}
System.out.println("sum of digits: "+rev);
break;
case 3:
System.out.println("\nEnter Integer: ");
int num3=sc.nextInt();
int temp=num3;
while(num3!=0)
{
rem=num3%10;
rev=rev*10+rem;
num3=num3/10;
}
if(temp==rev)
{
System.out.println("It is palindrome");
}
else
{
System.out.println("It is not palindrome");
}
break;
}
}
}

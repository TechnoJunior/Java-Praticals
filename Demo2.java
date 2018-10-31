import java.io.*;
import java.util.*;
import java.net.*;
class Demo2
{
	public static void main(String args[]) throws Exception  
	{
		int n;
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("******Menu Driven******");
			System.out.println("\n\n1.Open Notepad");
			System.out.println("\n2.Find IP address");
			System.out.println("\n3.Find Date and Time");
			System.out.println("\n4.System Restart");
			System.out.println("\n5.System Shutdown");
			System.out.println("\nEnter Your choice: ");
			n=sc.nextInt();
			Runtime r=Runtime.getRuntime();
			switch(n)
			{
			case 1:
			System.out.println("Open Notepad");
			r.exec("notepad");
			break;
			case 2:
			System.out.println("IP Address");
			System.out.println(InetAddress.getLocalHost());
			break;
			case 3:
			int day, month, year;
			int second, minute, hour;
			GregorianCalendar date = new GregorianCalendar();
			day = date.get(Calendar.DAY_OF_MONTH);
			month = date.get(Calendar.MONTH);
			year = date.get(Calendar.YEAR);
			second = date.get(Calendar.SECOND);
			minute = date.get(Calendar.MINUTE);
			hour = date.get(Calendar.HOUR);
			System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
			System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
			break;
			case 4:
			System.out.println("PC Restart");
			r.exec("shutdown -r");
			break;
			case 5:
			System.out.println("PC Shutdown");
			r.exec("shutdown -s -t 30");
			break;
			}
			System.out.println("\nDo you want to continue[Y or N]: ");
			ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}
}

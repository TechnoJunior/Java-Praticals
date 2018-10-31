import java.io.*;
import java.util.*;
class ATM
{
	double acc_no,balance=5000,withdraw,amt;
	String acc_type;
	int pin;
	ATM()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t*****Welcome To SBI Bank*****");
		System.out.println("\nInsert Your Card------");
		System.out.println("\nEnter Your PIN: ");
		pin=sc.nextInt();
		System.out.println("\nEnter Account Type: ");
		acc_type=sc.nextLine();
		System.out.println("\nEnter Withdraw Ammount: ");
		withdraw=sc.nextDouble();
		if(balance>withdraw)
		{
			System.out.println("\nBlanace Amount: "+(balance-withdraw));
		}
		else
		{
			System.out.println("\nInsufficent Balance");
		}
	}
	public void finalize()
	{
		System.out.println("\nThank you..............Visit Again To our ATM");
	}
	public static void main(String args[])
	{
		ATM obj=new ATM();
		obj=null;
		System.gc();
	}
}

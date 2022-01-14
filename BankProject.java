import java.io.*;
import java.util.*;


public class BankProject
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.println("Enter a starting balance: ");
		double balance = kbr.nextInt();
		System.out.print("Enter a name for the account: ");
		String accountName = kbr.next();
		System.out.println("How much do you want to deposit: ");
		double depositamt = kbr.nextInt();
		System.out.println("How much do you want to withdraw: ");
		double withdrawamt = kbr.nextInt();

		Bank myAccount = new Bank(balance,accountName);
		myAccount.deposit(depositamt);
		//System.out.println(myAccount.balance);
		myAccount.withdraw(withdrawamt);
		System.out.println("The " + myAccount.ownerName + " account balance is " + myAccount.balance);

	}
}

class Bank
{
	double balance;
	String ownerName;

	public Bank(double balance, String ownerName)
	{
		this.balance = balance;
		this.ownerName = ownerName;
	}

	public void deposit(double depositamt)
	{
		balance += depositamt;
	}
	public void withdraw(double withdrawamt)
	{
		balance -= withdrawamt;
	}

}

import java.util.Scanner;
import java.lang.*;
class BankAccount {
String name,type;
long no;
double bal;
BankAccount(String x,long y,String z,double b)
{
	name=x;
	no=y;
	type=z;
	bal=b;
}
void deposit(double x)
{
	if(x<0)
	{
		System.out.print("Invalid deposit amount\n");
		return;
	}
	bal+=x;
	System.out.print("Deposit successful. New balance: "+bal+"\n");
}
void withdraw(double x)
{
	if(x<0)
	{
		System.out.print("Invalid withdrawal amount\n");
		return;
	}
	if(bal<x)
	{
		System.out.print("Insufficient balance\n");
		return;
}
bal-=x;
System.out.print("Withdrawal successful. New balance: "+bal+"\n");
}
void displayAccountDetails()
{
	System.out.println("Account Holder: "+name);
	System.out.println("Account Number: "+no);
	System.out.println("Account Type: "+type);
	System.out.println("Balance: "+bal);
}
}
public class ExecuteAccount {
public static void main(String args[])
{
	String name,type;
	long no;
	double bal,depositAmount,withdrawAmount;
	Scanner s=new Scanner(System.in);
	System.out.print("account holder: ");
	name=s.next();
	System.out.print("account number: ");
	no=s.nextLong();
	System.out.print("account type: ");
	type=s.next();
	System.out.print("initial balance: ");
	bal=s.nextDouble();
	BankAccount account=new BankAccount(name,no,type,bal);
	System.out.print("amount to deposit: ");
	depositAmount=s.nextDouble();
	account.deposit(depositAmount);
	System.out.print("amount to withdraw: ");
	withdrawAmount=s.nextDouble();
	account.withdraw(withdrawAmount);
	System.out.println("Account Details:");
    
    account.displayAccountDetails();

}
	
}

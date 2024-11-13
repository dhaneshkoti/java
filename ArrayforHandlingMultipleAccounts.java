import java.util.Scanner;
class BankAccount {

	String name;
	long accno;
	String acctype;
	double balance;
	BankAccount(String n, long acno,String actp,double ba){
	name = n;
	accno = acno;
	acctype = actp;
	balance = ba;
}
	void deposit(double amount){
		if(amount<0){
			System.out.println("Invalid deposit amount");
		}else{
			balance = balance + amount;
			System.out.println("Deposit successful. New balance: "+balance);
		}
	}
	void withdraw(double amount){
		if(amount<=0){
			System.out.println("Invalid withdrawal amount");
		}else if(amount>balance){
			System.out.println("Insufficient balance");
		}
		else{
			balance = balance - amount;
			System.out.println("Withdrawal successful. New balance: "+balance);
		}
	}
	void displayAccountDetails(){
		System.out.println("Account Holder: "+name+"\nAccount Number: "+accno+"\nAccount Type: "+acctype+"\nBalance: "+balance);
	}

}
public class ExecuteAccount {
	public static void main(String z[])
	{
	
	Scanner s=new Scanner(System.in);
	BankAccount accounts[]=new BankAccount[5];
	for(int i=0;i<5;i++)
	{
		System.out.println("Account "+(i+1));
		System.out.print("Name: ");
		String n = s.next();
		System.out.print("Account Number: ");
		long no = s.nextLong();
		System.out.print("Account Type: ");
		String at = s.next();
		System.out.print("Initial balance: ");
		double b = s.nextDouble();
    accounts[i]= new BankAccount(n, no, at, b);
	}

	for(int i = 0;i<5;i++){
	System.out.println("Interaction with Account "+(i+1));
	System.out.print("Enter the amount to deposit: ");
	double depositAmount = s.nextDouble();
	accounts[i].deposit(depositAmount);
	System.out.print("Enter the amount to withdraw: ");
	double withdrawAmount = s.nextDouble();
	accounts[i].withdraw(withdrawAmount);
	}
	System.out.println("Account Details:");
	for(int i = 0 ; i< 5 ;i++){
		System.out.println("Account "+(i+1)+" Details:");
	accounts[i].displayAccountDetails();
	}
	}

}

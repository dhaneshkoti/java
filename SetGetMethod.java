import java.util.Scanner;
class BankAccount {
String name,type;
	long a_no;
	double amt;
	BankAccount(String name,long a_no,String type,double amt)
	{
		setName(name);
		setAno(a_no);
		setType(type);
		setAmt(amt);
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setAno(long a_no)
	{
		this.a_no=a_no;
	}
	void setType(String type)
	{
		this.type=type;
	}
	void setAmt(double amt)
	{
		this.amt=amt;
	}
	 String getName()
	{
		return name;
	}
	Long getAno()
	{
		return a_no;
	}
	String getType()
	{
		return type;
	}
	Double getAmt()
	{
		return amt;
	}
	void deposit(double dep)
	{
		if(dep>0)
		{
			setAmt(getAmt()+dep);
			System.out.println("Deposit successful. New balance: "+getAmt());
		}
		else
			System.out.println("Invalid deposit amount");
	}
	void withdraw(double with)
	{
    if(getAmt()>=with && with>0)
		{
			setAmt(getAmt()-with);
			System.out.println("Withdrawal successful. New balance: "+getAmt());
		}
		else if(with<0)
			System.out.println("Invalid withdrawal amount");
		else
			System.out.println("Insufficient balance");
	}
	void displayAccountDetails()
	{
		System.out.println("Account Holder: "+getName()+"\nAccount Number: "+getAno()+"\nAccount Type: "+getType()+"\nBalance: "+getAmt());
	}
}
public class ExecuteAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for account details
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("account number: ");
        long accNo = scanner.nextLong();
        scanner.nextLine(); // Consume newline
        System.out.print("account type: ");
        String accType = scanner.nextLine();
        System.out.print("initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a bank account
        BankAccount account = new BankAccount(name, accNo, accType, initialBalance);

        // Interaction with the account
        System.out.print("amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display account details
        System.out.println("Account Details:");
        account.displayAccountDetails();

        // Close the scanner
        scanner.close();
    }
}

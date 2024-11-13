import java.util.Scanner;
class BankAccount {

	String name,type;
	long a_no;
	double in_amt;
	double min_bal=100;
	BankAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("name: ");
		name=sc.next();
		System.out.print("account number: ");
		a_no=sc.nextLong();
		System.out.print("account type: ");
		type=sc.next();
		System.out.print("initial balance: ");
		in_amt=sc.nextDouble();
		deposit();
	}
	// Method to deposit an amount (with argument)
    public void deposit(double d_amt) {
    	if(d_amt>0)
		{
			in_amt+=d_amt;
			System.out.println("Deposit successful. New balance: "+in_amt);
		}
		else
			System.out.println("Invalid deposit amount");
    }
    
    // Overloaded method to deposit an amount (without argument)
    public void deposit() {
    	in_amt+=min_bal;
		System.out.println("Deposit successful. New balance: "+in_amt);
    }
	void withdraw(double w_amt)
	{
		if(in_amt>=w_amt && w_amt>0)
		{
			in_amt-=w_amt;
			System.out.println("Withdrawal successful. New balance: "+in_amt);
		}
		else if(w_amt<0)
			System.out.println("Invalid withdrawal amount");
		else
			System.out.println("Insufficient balance");
	}
	void displayAccountDetails()
	{
		System.out.println("Account Holder: "+name+"\nAccount Number: "+a_no+"\nAccount Type: "+type+"\nBalance: "+in_amt);
	}

//write your code here..
}
public class ExecuteAccount {
    public static void main(String[] args) {
        // Create a bank account using the modified constructor
        BankAccount account = new BankAccount();

        // Interaction with the account
        Scanner scanner = new Scanner(System.in);
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

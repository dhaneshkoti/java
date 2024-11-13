import java.util.Scanner;
class BankAccount {

	String name,type;
	long accNo;
	double balance;
	int depositorName;
    public BankAccount() {
        this.depositorName = 0;
			}

	BankAccount(String name,long accNo,String type,double balance)

	{

		this.name = name;

		this.accNo = accNo;

		this.type = type;

		this.balance = balance;

	}

	void deposit(double amount){

		if(amount > 0 ){

			balance += amount;

			System.out.println("Deposit successful. New balance: "+balance);

		}   

		else{

			System.out.println("Invalid deposit amount");

		}

	}

	void withdraw(double amount){

		if(amount <=balance && amount >0){

			balance -= amount;

			System.out.print("Withdrawal successful. New balance: "+balance);

		}

		else if (amount > balance){
      System.out.print("Insufficient balance");

		}

		else{

			System.out.print("Invalid withdrawal amount");

		}

	}

	void displayAccountDetails(){

		System.out.println("Account Holder: "+name+"\n"+"Account Number: "+accNo+"\n"+"Account Type: "+type+"\n"+"Balance: "+balance);

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
        System.out.println("\nAccount Details:");
        account.displayAccountDetails();

        // Close the scanner
        scanner.close();
    }
}

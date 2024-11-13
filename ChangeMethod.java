import java.util.Scanner;
class BankAccount
	{
		long a_no;
		static int s=0;
		String name,type;
		double in_amt;
		BankAccount(String peru,long ano,String typ,double bal)
		{
			name=peru;
			a_no=ano;
			type=typ;
			in_amt=bal;
		}
		void deposit(double d_amt)
		{
			if(d_amt>0)
			{
				in_amt+=d_amt;
				System.out.println("Deposit successful. New balance: "+in_amt);
			}
			else
				System.out.println("Invalid deposit amount");
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
			s++;
			System.out.println("Account Holder: "+name+"\nAccount Number: "+a_no+"\nAccount Type: "+type+"\nBalance: "+in_amt);
		}
		static void displayTotalAccountHolders()
		{
			System.out.println("Total Account Holders: "+s);
		}
	}


public class ExecuteAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number of account holders: ");
        int numAccountHolders = scanner.nextInt();
      scanner.nextLine(); // Consume newline

        BankAccount[] accounts = new BankAccount[numAccountHolders];

        for (int i = 0; i < numAccountHolders; i++) {
            System.out.println("Account holder " + (i + 1));
            System.out.print("name: ");
            String name = scanner.nextLine();
            System.out.print("account number: ");
            long accNo = scanner.nextLong();
            scanner.nextLine(); // Consume newline
            System.out.print("account type: ");
            String accType = scanner.nextLine();
            System.out.print("initial balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            accounts[i] = new BankAccount(name, accNo, accType, initialBalance);

            System.out.print("amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            accounts[i].deposit(depositAmount);

            System.out.print("amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            accounts[i].withdraw(withdrawAmount);
            scanner.nextLine(); // Consume newline
        }

        System.out.println("Account Details:");
        for (int i = 0; i < numAccountHolders; i++) {
            System.out.println("Account Holder " + (i + 1) + ":");
            accounts[i].displayAccountDetails();
        }

        BankAccount.displayTotalAccountHolders();

        scanner.close();
    }
}

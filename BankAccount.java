package BankAccount;

public class BankAccount {
	public String firstName;
	public String lastName;
	public int accountID;
	public double balance;
	
	public BankAccount(String firstName, String lastName, int accountID, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		if (deposit > 0) {
			this.balance += deposit;
		}
	}
	public void withdrawal(double withdrawal) {
		if (withdrawal > 0) {
			this.balance -= withdrawal;
		}
	}
	public void accountSummary() {
		System.out.println("Account number: " + this.accountID);
		System.out.println("Account holder: " + this.lastName + ", " + this.firstName);
		System.out.println("Balance: $" + String.format("%.2f",this.balance));
	}

}

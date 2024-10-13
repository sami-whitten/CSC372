package BankAccount;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {
	public double interestRate;
	Scanner userInput = new Scanner(System.in);
	
	public CheckingAccount(String firstName, String lastName, int accountID, double balance) {
		super(firstName, lastName, accountID, balance);
		interestRate = 0.006;		
	}
	
	public void processWithdrawal(double amount) {
		if (super.balance-amount <0) {
			System.out.println("Insufficent funds");
			System.out.println("Continue with withdrawal?");
			System.out.println("1: Yes");
			System.out.println("2: No, cancel withdrawal");
			String option = userInput.nextLine();
			if(option.equalsIgnoreCase("1")) {
				if(super.balance - amount < -30) {
					System.out.println("You have exceeded your overdraft limit.");
					System.out.println("Canceling transaction....");}
				else {
					super.balance -= amount;
					System.out.println("You have withdrawn $" + String.format("%.2f", amount));
					System.out.println("You now have a balance of $" + String.format("%.2f",super.balance));
				}
			}
			else {
				System.out.println("Canceling...");
			}
			
		}
		else {
			super.balance -= amount;
			System.out.println("You have withdrawn $" + String.format("%.2f", amount));
			System.out.println("You now have a balance of $" + String.format("%.2f",super.balance));
		}
		
			
	}
	
	public void displayAccount() {
		System.out.println("Account number: " + super.accountID);
		System.out.println("Account holder: " + super.lastName + ", " + super.firstName);
		System.out.println("Balance: " + String.format("%.2f",super.balance));
		System.out.println("Interest rate: " + this.interestRate*100 + "%");
	}

}

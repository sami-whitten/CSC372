package BankAccount;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int user_option = 1;
		int menu_option;
		double amount;
		Scanner inputAmount = new Scanner(System.in);
		CheckingAccount account1 = new CheckingAccount("Mickey","Mouse",123456,100.00);
		
		do {
			System.out.println("What would you like to do?");
			System.out.println("1: Print account summary");
			System.out.println("2: Make deposit");
			System.out.println("3: Make withdrawal");
			Scanner menuOption = new Scanner(System.in);
			menu_option = menuOption.nextInt();
			switch(menu_option) {
			case 1:
				account1.displayAccount();
				break;
			case 2:
				System.out.println("How much would you like to deposit?");
				amount = inputAmount.nextDouble();
				account1.deposit(amount);
				account1.accountSummary();
				break;
			case 3:
				System.out.println("How much would you like to withdrawal?");
				amount = inputAmount.nextDouble();
				account1.processWithdrawal(amount);
				account1.accountSummary();
				break;
			default:
				System.out.println("Error");
			}
			System.out.println("Would you like to continue?");
			System.out.println("1: Yes");
			System.out.println("2: No");
			Scanner userInput = new Scanner(System.in);
			user_option = userInput.nextInt();
			
		}
		while (user_option == 1);
		System.out.println("Goodbye!");
		
	}
}

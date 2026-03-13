package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Create account
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		Account account = new Account(number, holder);
		
		//Initial deposit
		System.out.print("\nIs there an initial deposit (y/n)? ");
		char feedback = sc.next().charAt(0);

		if (feedback == 'y') {

			System.out.print("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			account.Deposit(depositValue);

		} else {

			System.out.println("No deposits made.");
		}

		System.out.println(account);
		
		//Deposit
		System.out.print("\n\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.Deposit(depositValue);

		System.out.println("\nUpdated current data: \n" + account);
		
		//Withdraw
		System.out.print("\n\nEnter a withdrawal value: ");
		double withdrawalValue = sc.nextDouble();
		account.Withdrawal(withdrawalValue);
		
		System.out.println("\nUpdated current data: \n" + account);

		sc.close();
	}

}

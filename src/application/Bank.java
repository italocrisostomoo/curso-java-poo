package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Bank {

	public static void main(String[] args) {
		
		char feedback;
		int feedback2;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Create account
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		Account account = new Account(number, holder);

		

		do {
			
			// Initial deposit
			System.out.print("\nIs there an initial deposit (y/n)? ");
			feedback = sc.next().charAt(0);
			
			switch (feedback) {
			case 'y':

				System.out.print("Enter initial deposit value: ");
				double depositValue = sc.nextDouble();
				account.Deposit(depositValue);

				break;

			case 'Y':

				System.out.print("Enter initial deposit value: ");
				depositValue = sc.nextDouble();
				account.Deposit(depositValue);

				break;

			case 'n':

				System.out.println("No deposits made.");
				break;

			case 'N':

				System.out.println("No deposits made.");
				break;

			default:

				System.out.println("Invalid input. Try again.");
				break;

			}
			
		} while (feedback != 'y' && feedback != 'Y' && feedback != 'n' && feedback != 'N');
		
		System.out.println();
		System.out.println(account + "\n");
		
		
		do {
			
			System.out.println("Choose an option: ");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("3 - Finish");
			System.out.print("\nOption: ");
			feedback2 = sc.nextInt();
			
			switch (feedback2) {
		    case 1:
		        // Deposit
		        System.out.print("\nEnter a deposit value: ");
		        double depositValue = sc.nextDouble();
		        account.Deposit(depositValue);
		        break;

		    case 2:
		        // Withdraw
		        System.out.print("\nEnter a withdrawal value: ");
		        double withdrawalValue = sc.nextDouble();
		        account.Withdrawal(withdrawalValue);
		        break;

		    case 3:
		        System.out.println("Finishing...");
		        break;

		    default:
		        System.out.println("Invalid input. Try again.");
		        break;
		}
	
			System.out.println("\nCurrent data: " + account + "\n");
			
		}while(feedback2 != 3);
		sc.close();
	}

}

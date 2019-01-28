package test;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.Account;
import bean.Balance;
import bean.CurrentAccount;
import bean.Overdraft;
import bean.SavingsAccount;
import exception.AccountNumberAlreadyExistsException;
import service.AccountService;

public class SwitchMainClass {

	static AccountService service = new AccountService();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;

		boolean exit = false;
		do {
			choice = displayMenu();
			switch (choice) {
			case 1:
				createAccount();
				break;

			case 2:
				break;

			case 3:
				deleteAccount();
				break;

			case 4:
				System.out.println("Enter Account Number Which Send Money");
				Long accountNumber1 = sc.nextLong();
				System.out.println("Enter Account Number Which Recieve Money");
				Long accountNumber2 = sc.nextLong();
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				service.balanceTransfer(accountNumber1, accountNumber2, amount);
				System.out.println("Money Transfer Succesfully\n");
				break;

			case 5:
				retrievAccount();
				break;

			case 0:
				exit = true;
				break;

			default:
				System.out.println("You Enter Wrong Choice\n ");
				break;
			case -786:
				break;
			}
		} while (!exit);
	}

	private static void createAccount() {
		int n = SwitchMainClass.accountType();
		System.out.println("Enter New Account Number");
		long number = sc.nextLong();
		Account account = accountFactory(n, number);
		if (account != null) {
			createAccount(account);
		}
	}

	private static Account accountFactory(int choice, long accountNumber) {
		switch (choice) {
		case 1:
			return new SavingsAccount(accountNumber);
		case 2:
			return new CurrentAccount(accountNumber);
		case 3:
			return new Overdraft(accountNumber);
		default:
			System.out.println("You Enter Wrong Choice\n");
			return null;
		}
	}

	private static void deleteAccount() {
		System.out.println("Enter Account Number Which Delete ");
		Long accountNumber;
		try {
			accountNumber = sc.nextLong();
			service.deleteAccount(accountNumber);
			System.out.println(accountNumber + " Account Deleted Succesfully\n");
		} catch (Exception e) {
			System.err.println("Please enter Valid Account Number");
		}

	}

	private static int displayMenu() {
		int choice = -786;
		System.out.println("Welcome To Online Banking \n\nPlease Enter Choice");
		System.out.println("1. Create Account");
		System.out.println("2. Update Account");
		System.out.println("3. Delete Account");
		System.out.println("4. Transfer Money");
		System.out.println("5. View Account Detail");
		System.out.println("0. exit");
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.err.println("Please Enter Valid Choice");
		}
		return choice;
	}

	public static int accountType() {
		System.out.println("Select Account Type\n");
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		System.out.println("3. Overdraft Account");
		int n = sc.nextInt();
		return n;

	}

	public static void createAccount(Account account) {

		try {
			service.createAccount(account);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return;
		} catch (AccountNumberAlreadyExistsException e) {
			System.err.println(e.getMessage());
			return;
		}
		System.out.println("Enter Current Balance");
		double current = sc.nextDouble();
		account.setCurrent(new Balance(current));
		System.out.println("Enter Ledger Balance");
		double ledger = sc.nextDouble();
		account.setLedger(new Balance(ledger));
		System.out.println("Account Created Succesfully\n");
	}

	public static void retrievAccount() {
		System.out.println("Enter Account Number");
		try {
			long acc = sc.nextLong();
			System.out.println(service.retriveAccount(acc));
		} catch (InputMismatchException e) {
			System.err.println("Please Enter Valid Account Number");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}

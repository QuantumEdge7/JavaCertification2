package chapter1.polymorphismdemo;

import java.util.Scanner;

public class AccountTest {

	public static void getBankingActivities(Account account) {
		account.openAccount();
		if (account instanceof SavingAccount) {
			SavingAccount savingAccount = (SavingAccount) account;
			savingAccount.depost();
		} else if (account instanceof CurrentAccount) {
			CurrentAccount currentAccount = (CurrentAccount) account;
			currentAccount.withdraw();
		}
	}

	public static void main(String[] args) {
		Account account = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter account choice: ");
		String choice = input.next();

		switch (choice) {
		case "saving":
			account = new SavingAccount();
			break;
		case "current":
			account = new CurrentAccount();
			break;
		default:
			System.out.println("wrong choice!!!");
			break;
		}

		getBankingActivities(account);

	}

}

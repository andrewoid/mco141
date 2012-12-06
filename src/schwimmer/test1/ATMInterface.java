package schwimmer.test1;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ATMInterface {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		DecimalFormat f = new DecimalFormat("$###,###,###.00");

		System.out.println("Enter your account number");
		int accountNumber = keyboard.nextInt();

		double startingBalance = rand.nextInt(900) + 100;
		System.out.println("Your current balance is: "
				+ f.format(startingBalance));
		System.out.println("How much would you like to deposit?");
		double deposit = keyboard.nextDouble();
		System.out.println("How much would you like to withdraw?");
		double withdraw = keyboard.nextDouble();
		double endingBalance = startingBalance + deposit - withdraw;

		System.out.println();

		if (endingBalance < 0) {
			System.out.println("Insufficient funds");
		} else {
			System.out.println("Transaction Summary");
			System.out.println("Account Number: " + accountNumber);
			System.out
					.println("Starting Balance: " + f.format(startingBalance));
			System.out.println("Deposit Amount: " + f.format(deposit));
			System.out.println("Withdraw Amount: " + f.format(withdraw));
			System.out.println("Ending Balance: " + f.format(endingBalance));
		}

		if (endingBalance == 0) {
			System.out.println("Need more cash.");
			System.out.println("Call customer service... 857-8376");
		}
	}

}

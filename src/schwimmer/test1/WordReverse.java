package schwimmer.test1;

import java.util.Scanner;

public class WordReverse {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a 6 character word: ");
		String word = keyboard.next();
		String reverse = "" + word.charAt(5) + word.charAt(4) + word.charAt(3)
				+ word.charAt(2) + word.charAt(1) + word.charAt(0);

		System.out.print("The word reversed is: ");
		System.out.println(reverse);

	}

}

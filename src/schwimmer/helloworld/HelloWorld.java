package schwimmer.helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {

		int numberOfApples;
		double pricePerApple;
		double amountDue;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount of Apples ");
		numberOfApples = scanner.nextInt();
		
		System.out.println("Enter the price per apple");
		pricePerApple = scanner.nextDouble();
		
		amountDue = numberOfApples * pricePerApple;
		
		System.out.println("I will pay " + amountDue + " dollars");
	
		
	}
}

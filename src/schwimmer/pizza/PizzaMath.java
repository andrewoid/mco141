package schwimmer.pizza;

import java.util.Scanner;

public class PizzaMath {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many people?");
		int numPeople = scanner.nextInt();
		System.out.println("How many pies?");
		int numPies = scanner.nextInt();

		final int SLICES_PER_PIE = 8;

		// 8 SLICES per pie
		double slicesPerPerson = SLICES_PER_PIE * numPies / numPeople;
		System.out.println("Slices per person = " + slicesPerPerson);

		int remainderSlices = SLICES_PER_PIE * numPies % numPeople;
		System.out.println("Slices remaining = " + remainderSlices);
	}
}

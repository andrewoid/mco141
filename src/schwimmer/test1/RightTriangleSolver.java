package schwimmer.test1;

import java.text.DecimalFormat;

public class RightTriangleSolver {

	public static void main(String args[]) {

		double sideA = 7;
		double sideB = 24;
		double sideC = Math.sqrt(sideA * sideA + sideB * sideB);

		double angleA = Math.toDegrees(Math.asin(sideA / sideC));
		double angleB = 90 - angleA;

		DecimalFormat f = new DecimalFormat(".0000");

		System.out.println("Side A: " + f.format(sideA));
		System.out.println("Side B: " + f.format(sideB));
		System.out.println("Side C: " + f.format(sideC));

		System.out.println("Angle A: " + f.format(angleA));
		System.out.println("Angle B: " + f.format(angleB));

	}
}

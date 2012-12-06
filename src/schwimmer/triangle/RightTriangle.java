package schwimmer.triangle;

import java.text.DecimalFormat;

public class RightTriangle {

	private double sideA;
	private double sideB;
	
	public RightTriangle( double a, double b ) {
		sideA = a;
		sideB = b;
	}

	public double getSideC() {
		double sideC = Math.sqrt(sideA * sideA + sideB * sideB);

		return sideC;
	}

	public double getAngleA() {
		double sideC = getSideC();
		double angleA = Math.asin(sideA / sideC);

		return Math.toDegrees(angleA);
	}

	public double getAngleB() {
		double angleA = getAngleA();
		double angleB = 90 - angleA;
		return angleB;
	}

	public String toString() {

		DecimalFormat f = new DecimalFormat(".0000");

		String sA = "Side A : " + f.format(sideA);
		String sB = "\nSide B : " + f.format(sideB);
		double c = getSideC();
		String sC = "\nSide C : " + f.format(c);

		double angleA = getAngleA();
		String aA = "\nAngle A: " + f.format(angleA);
		double angleB = getAngleB();
		String aB = "\nAngle B: " + f.format(angleB);

		return sA + sB + sC + aA + aB;
	}

}

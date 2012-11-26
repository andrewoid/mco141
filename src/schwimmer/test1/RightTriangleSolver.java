package schwimmer.test1;


public class RightTriangleSolver {

	public static void main(String args[]) {

		double sideA = 7;
		double sideB = 24;
		double sideC = Math.sqrt(sideA * sideA + sideB * sideB);

		double angleA = Math.toDegrees( Math.asin(sideA / sideC) );
		double angleB = 90 - angleA;

		System.out.println("Side A: " + sideA);
		System.out.println("Side B: " + sideB);
		System.out.println("Side C: " + sideC);

		System.out.println("Angle A: " + angleA);
		System.out.println("Angle B: " + angleB);

	}
}

package schwimmer.test1;

import java.text.DecimalFormat;

import schwimmer.triangle.RightTriangle;

public class RightTriangleSolver {

	public static void main(String args[]) {
		
		RightTriangle tri1 = 
			new RightTriangle(7,24);
		System.out.println(tri1.toString());

		RightTriangle tri2 = 
			new RightTriangle(5,12);
		System.out.println(tri2.toString());

		RightTriangle tri3 = 
			new RightTriangle(3,4);
		System.out.println(tri3.toString());
		

	}
}

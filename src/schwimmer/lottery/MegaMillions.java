package schwimmer.lottery;

import java.util.Random;

public class MegaMillions {

	public static void main(String args[]) {
		
		Random numbers = new Random();
		
		int value1 = numbers.nextInt(56) + 1;
		int value2 = numbers.nextInt(56) + 1;
		int value3 = numbers.nextInt(56) + 1;
		int value4 = numbers.nextInt(56) + 1;
		int value5 = numbers.nextInt(56) + 1;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		
	}
	
}

package schwimmer.money;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CashRegister {

	public static void main(String[] args) {
		
		int gallons = 6001;
		double dollarsPerGallon = 4.599;
		double total = gallons * dollarsPerGallon;
		
		System.out.println(total);
		
		DecimalFormat formatter = 
			new DecimalFormat("$##,###.00");
		formatter.setRoundingMode(
				RoundingMode.DOWN);
		
		System.out.println(formatter.format(total));
		
		
	}

}

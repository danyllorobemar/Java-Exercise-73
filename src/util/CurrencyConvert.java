package util;

public class CurrencyConvert {
	
	public static final double IOF = 0.06; 
	
	public static void dollar(double dollarPrice, double dollarAmount) {
		System.out.printf("Amount to be paid in Reais = %.2f%n ", 
				dollarPrice * dollarAmount * (1+IOF));
	}

}

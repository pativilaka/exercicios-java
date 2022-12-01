package util;

public class Cambio {
	
	public static final double IOF = 6.0;
	
	public static double currencyConverter(double priceDollar, double dollar) {
		
		double totalDollar = priceDollar * dollar;
		return totalDollar + ((totalDollar*IOF)/100);
		
	}

}

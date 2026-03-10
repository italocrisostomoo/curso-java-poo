package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double converter(double priceDollars, double qtDollars) {

		return (priceDollars * qtDollars) + (priceDollars * qtDollars * IOF);
		// return (priceDollars * qtDollars) - (priceDollars * qtDollars / IOF);
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;


public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double priceDollars = sc.nextDouble();
		
		System.out.print("How many Dollars(US$) will be bought? ");
		double qtDollars = sc.nextDouble();
		
		//double priceReais = CurrencyConverter.converter(priceDollars, qtDollars);
		System.out.printf("Amount to be paid in Reais(R$) = %.2f ", CurrencyConverter.converter(priceDollars, qtDollars) );
		sc.close();

	}

}

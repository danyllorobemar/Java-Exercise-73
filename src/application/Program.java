package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvert;

public class Program {

	public static void main(String[] args) {
		
		double dollarPrice, dollarAmount;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What's the dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollar will be bought?");
		dollarAmount = sc.nextDouble();
		
		CurrencyConvert.dollar(dollarPrice, dollarAmount);
	
		sc.close();

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter calc = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollar will be bougth?");
		double many = sc.nextDouble();
		
		double conv = calc.Converter(dollar, many);
				
				
		System.out.printf("Amount to be paid in reais = %.2f%n", conv);
		
		sc.close();
	}

}

package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.println();
		
		System.out.print("How many dollars will be bought? ");  
		double mydollar = sc.nextDouble();
		System.out.println();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.valorfinal(dollar, mydollar));
		sc.close();
	}

}

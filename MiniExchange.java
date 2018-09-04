
import java.util.Scanner;

public class MiniExchange {

	static double convertToUSD(double pln) {
		return pln * 3.68;
	}

	static double convertToEUR(double pln) {
		return 4.29 * pln;
	}

	static double convertToCHF(double pln) {
		return 3.80 * pln;
	}

	static double convertToGBP(double pln) {
		return 3.82 * pln;
	}

	static double convertToDKK(double pln) {
		return 0.57 * pln;
	}

	static double convertToNOK(double pln) {
		return 0.44 * pln;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to our exchange! Here You can check exchange rate");
		System.out.println("1 USD = 3.68 PLN" + "\n" + "1 EUR = 4.29 PLN" + "\n" + "1 CHF = 3.80 PLN" + "\n"
				+ "1 GBP = 3.82 PLN" + "\n" + "1 DKK = 0.57 PLN" + "\n" + "1 NOK = 0.44 PLN");
		System.out.println("Please type currency: USD, CHF, EUR, NOK, DKK, GBP");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String exchangeRate= input.toUpperCase();
	
		switch (exchangeRate) {
		case "USD":
			System.out.print("You chose USD, how much You want to buy? ");
			break;
		case "EUR":
			System.out.print("You chose EUR, how much You want to buy? ");
			break;
		case "CHF":
			System.out.print("You chose CHF, how much You want to buy? ");
			break;
		case "GBP":
			System.out.print("You chose GBP, how much You want to buy?");
			break;
		case "NOK":
			System.out.print("You chose NOK, how much You want to buy? ");
			break;
		case "DKK":
			System.out.print("You chose DKK, how much You want to buy? ");
			break;

		}
	
		
		double howMuch = scan.nextDouble();

		if (exchangeRate.equalsIgnoreCase("USD")) {
			System.out.println("You will pay " + convertToUSD(howMuch) + " PLN");
		}

		else if (exchangeRate.equalsIgnoreCase("CHF")) {
			System.out.println("You will pay " + convertToCHF(howMuch) + " PLN");
		}
		
		else if (exchangeRate.equalsIgnoreCase("NOK")) {
			System.out.println("You will pay " + convertToNOK(howMuch) + " PLN");
		}
		
		else if (exchangeRate.equalsIgnoreCase("DKK")) {
			System.out.println("You will pay " + convertToDKK(howMuch) + " PLN");
		}
		
		else if (exchangeRate.equalsIgnoreCase("DKK")) {
			System.out.println("You will pay " + convertToGBP(howMuch) + " PLN");
		}
		
		else if (exchangeRate.equalsIgnoreCase("EUR")) {
			System.out.println("You will pay " + convertToEUR(howMuch) + " PLN");
		}
		
		
	}
}
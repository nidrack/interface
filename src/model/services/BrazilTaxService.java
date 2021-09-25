package model.services;

public class BrazilTaxService implements TaxService {

	public double tax(double amount) {
		double percentage;
		if (amount <= 100.0 ) {
			percentage = 0.2;
		} else {
			percentage = 0.15;
		}
		return amount * percentage;
	}
}

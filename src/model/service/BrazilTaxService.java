package model.service;

public class BrazilTaxService implements TaxService {
	
	public double tax(double price) {
		if (price < 100.0) {
			return price * 0.2;
		} else {
			return price * 0.15;
		}

	}
}

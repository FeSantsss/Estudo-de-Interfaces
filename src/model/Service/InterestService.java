package model.Service;

public interface InterestService {
	Double getInterestRate();

	default Double payment(Double amount, Integer months) {
		if (months < 1) {
			throw new IllegalArgumentException("Months must be greater than zero");
		} else {
			return amount * Math.pow(1 + getInterestRate() / 100.0, months);
		}
	}
}

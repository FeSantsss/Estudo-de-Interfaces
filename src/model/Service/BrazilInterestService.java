package model.Service;

public class BrazilInterestService implements InterestService {

	private Double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}

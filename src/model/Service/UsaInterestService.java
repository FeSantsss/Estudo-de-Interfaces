package model.Service;

public class UsaInterestService implements InterestService {

	private Double interestRate;

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}

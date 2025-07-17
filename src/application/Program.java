package application;

import java.util.Locale;
import java.util.Scanner;

import model.Service.BrazilInterestService;
import model.Service.UsaInterestService;
import model.Service.InterestService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Quantia: ");
			double amount = sc.nextDouble();
			System.out.print("Meses: ");
			int months = sc.nextInt();
			
			InterestService is = new BrazilInterestService(2);
			double valorFinal = is.payment(amount, months);
			
			System.out.println("Valor final: " + String.format("%.2f", valorFinal));
		}
	}
}
package application;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Entre com os dados do aluguel");

			System.out.print("Modelo do carro: ");
			String carModel = sc.nextLine();
			System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
			LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
			System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
			LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

			CarRental car = new CarRental(start, finish, new Vehicle(carModel));

			System.out.print("Entre com o preço por hora: ");
			double pricePerHour = sc.nextDouble();
			System.out.print("Entre com o preço por dia: ");
			double pricePerDay = sc.nextDouble();

			RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
			rentalService.processInvoice(car);

			System.out.println(car.toString());
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
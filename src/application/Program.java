package application;

import model.entities.*;
import model.service.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entre com os dados do contrato:");
			
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate data = LocalDate.parse(sc.next(), fmt);
			System.out.print("Valor do contrato: ");
			double valorContrato = sc.nextDouble();
			
			Contract contractInitial = new Contract(numero, data, valorContrato);
			
			System.out.print("Entre com o número de parcelas: ");
			int numParcelas = sc.nextInt();
			
			ContractService contractService = new ContractService(new PaypalService());
			contractService.processContract(contractInitial, numParcelas);
			
			System.out.println("Parcelas:");
			for (Installment installment : contractInitial.getInstallments()) {
				System.out.println(installment.toString());
			}
		}
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}

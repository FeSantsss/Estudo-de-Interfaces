package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate DueDate;
	private Double Amount;
	
	public Installment(LocalDate dueDate, Double amount) {
		DueDate = dueDate;
		Amount = amount;
	}
	
	public LocalDate getDueDate() {
		return DueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		DueDate = dueDate;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	
	@Override
	public String toString() {
		return DueDate.format(fmt) + " - " + String.format("%.2f", Amount);
	}
	
}

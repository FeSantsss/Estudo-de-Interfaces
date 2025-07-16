package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "/home/santsss/Documentos/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeecsv = br.readLine();
			
			while (employeecsv != null) {
				String[] fields = employeecsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeecsv = br.readLine();
			}
			Collections.sort(list);
			
			for (Employee s : list) {
				System.out.println(s);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
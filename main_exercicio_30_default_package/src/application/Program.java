package application;

import java.util.Locale;
import java.util.Scanner;

import entities_employee_registration.Employee_registration;

import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registrated: ");
		int n = sc.nextInt();

		List<Employee_registration> list = new ArrayList<>();

		System.out.println();
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			while (IsThereId(list, id)) {
				System.out.println("Id already taken!");
			}
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			Employee_registration employee_registration = new Employee_registration(id, name, salary);

			list.add(employee_registration);
		}

		System.out.print("Enter the employee id that will have salar increase: ");
		int idsalary = sc.nextInt();
		
		Employee_registration emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		// Integer pos = position(list, );
		
		
		if (emp == null) {
			System.out.println("This Id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employees: ");
		for (Employee_registration e : list) {
			System.out.println(e);
		}

		sc.close();

	}

	
	public static Integer position(List<Employee_registration> list, int id) {
		for (int i = 0; i < list.size(); i++ ) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;	
	}
	
	public static boolean IsThereId(List<Employee_registration> list, int id) {
		Employee_registration emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}

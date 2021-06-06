package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class appMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = e.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");

			System.out.print("Outsourced (Y | N): ");
			char op = e.next().charAt(0);
			e.nextLine();

			System.out.print("Name: ");
			String name = e.nextLine();

			System.out.print("Hour: ");
			int hour = e.nextInt();
			e.nextLine();

			System.out.print("Value per hour: ");
			double valuePerHour = e.nextDouble();
			if (op == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = e.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hour, valuePerHour, addCharge);
				employee.add(emp);
			}else {
				Employee emp = new Employee(name, hour, valuePerHour);
				employee.add(emp);
			}

		}

		System.out.println();

		System.out.println("PAYMENTS");

		for (Employee emplList : employee) {
			System.out.println(emplList.getName() + " - $ " + emplList.payment());
		}

		e.close();
	}

}

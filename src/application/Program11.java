package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.NewEmployee;

public class Program11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<NewEmployee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int qttReg = sc.nextInt();

		for (int i = 0; i < qttReg; i++) {

			System.out.println("\nEmployee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new NewEmployee(id, name, salary));

		}

		System.out.println("\nList of employees:");

		for (NewEmployee x : list) {

			System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
		}

		System.out.println("\nEnter the Id that will have salary increase: ");
		int idIncrease = sc.nextInt();

		int match = 0;

		for (NewEmployee x : list) {

			if (idIncrease == x.getId()) {

				match++;

				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();

				x.setSalary(x.getSalary() + x.getSalary() * percentage);

			}

		}
		
		if (match == 0) {
			System.out.println("The Id does not exist!");
		}

		System.out.println("\nList of employees:");

		for (NewEmployee x : list) {

			System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
		}

		sc.close();

	}

}

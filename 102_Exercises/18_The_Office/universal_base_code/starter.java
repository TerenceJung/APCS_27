/*
 *	Author: Terence Jung
 *  Date: 10/21/2026
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
	
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();

		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();

		Employee BradPitt = new Employee(110101000, "Brad", "Pitt", 9999999999.99);
		BradPitt.employeeToString();

		michael.raiseSalary(1);
		Dwight.raiseSalary(2);
		Jim.raiseSalary(3);
		Pam.raiseSalary(4);
		BradPitt.raiseSalary(3205940);

		michael.employeeToString();
		System.out.println("Annual Salary: " + michael.getAnnualSalary());
		System.out.println();
		System.out.println();

		Dwight.employeeToString();
		System.out.println("Annual Salary: " + Dwight.getAnnualSalary());
		System.out.println();
		System.out.println();

		Jim.employeeToString();
		System.out.println("Annual Salary: " + Jim.getAnnualSalary());
		System.out.println();
		System.out.println();

		Pam.employeeToString();
		System.out.println("Annual Salary: " + Pam.getAnnualSalary());
		System.out.println();
		System.out.println();
		
		BradPitt.employeeToString();
		System.out.println("Annual Salary: " + BradPitt.getAnnualSalary());



	}
}

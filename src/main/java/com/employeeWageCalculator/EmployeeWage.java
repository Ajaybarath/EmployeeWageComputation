package com.employeeWageCalculator;

public class EmployeeWage {

	public static void main(String args[]) {
		
		int EmployeeStatus = (int) (Math.floor(Math.random() * 10) % 2);
		
		if (EmployeeStatus == 1) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
		
	}
}

package com.employeeWageCalculator;

public class EmployeeWage {
	
	private static final int EmployeeWagePerHour = 20;
	private static final int FullDayHours = 8;

	public static void main(String args[]) {
		
		int employeeStatus = (int) (Math.floor(Math.random() * 10) % 2);
		int employeeWage = 0;
		
		if (employeeStatus == 1) {
			employeeWage = EmployeeWagePerHour * FullDayHours;
		}
		else {
			employeeWage = 0;
		}
		
		System.out.println("Employee wage calculated is " + employeeWage);
		
	}
}

package com.employeeWageCalculator;

public class EmployeeWage {

	private static final int EmployeeWagePerHour = 20;
	private static final int FullDayHours = 8;
	private static final int PartTimeHours = 4;

	public static void main(String args[]) {

		int employeeAttendenceStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means present, 0 means absent

		int employeeWorkStatus = (int) (Math.floor(Math.random() * 10) % 2) + 1; // 1 means fulltime, 0 means partime

		int employeeWage = 0;

		if (employeeAttendenceStatus == 0) {
			employeeWorkStatus = 0;
		}

		switch (employeeWorkStatus) {
		case (1):
			employeeWage = EmployeeWagePerHour * FullDayHours;
			break;

		case (2):
			employeeWage = EmployeeWagePerHour * PartTimeHours;
			break;

		default:
			employeeWage = 0;
		}

		System.out.println("Employee wage calculated is " + employeeWage);

	}
}
